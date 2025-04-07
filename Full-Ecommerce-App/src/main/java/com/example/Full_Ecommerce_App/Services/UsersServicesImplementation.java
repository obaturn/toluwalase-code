package com.example.Full_Ecommerce_App.Services;

import com.example.Full_Ecommerce_App.Configuration.SecurityConfiguration.JwtUtils;
import com.example.Full_Ecommerce_App.DTO.Request.LoginRequest;
import com.example.Full_Ecommerce_App.DTO.Request.RegisterUserRequest;
import com.example.Full_Ecommerce_App.DTO.Response.LoginResponse;
import com.example.Full_Ecommerce_App.DTO.Response.UserRegisterResponse;
import com.example.Full_Ecommerce_App.Data.Model.Address;
import com.example.Full_Ecommerce_App.Data.Model.Users;
import com.example.Full_Ecommerce_App.Data.Repository.UsersRepository;
import com.example.Full_Ecommerce_App.Exceptions.UsersExceptions;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServicesImplementation implements UsersServices {

    private final UsersRepository userRepository;
    private final ModelMapper mapper;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public UsersServicesImplementation(UsersRepository usersRepository,
                                       PasswordEncoder passwordEncoder,
                                       ModelMapper modelMapper
    ,AuthenticationManager authenticationManager , JwtUtils jwtUtils) {
        this.userRepository = usersRepository;
        this.mapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtils = jwtUtils;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public UserRegisterResponse CreateUser( RegisterUserRequest usersRequest) {
        Optional<Users> existingUser = userRepository.findByUserName(usersRequest.getUserName());

        if (existingUser.isPresent()) {
            throw new UsersExceptions("User already exists with the given email: " + usersRequest.getEmail());
        }

        Users user = mapper.map(usersRequest, Users.class);
        user.setPassword(passwordEncoder.encode(usersRequest.getPassword()));
        user.setRoles(usersRequest.getRoles());
        List<Address> addresses = user.getAddresses();
        if (addresses != null) {
            for (Address address : addresses) {
                address.setUser(user);
            }
        }
        userRepository.save(user);
        return getCreateUserRegisterResponse(usersRequest);
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public LoginResponse Login(LoginRequest loginRequest) {
        Users user = userRepository.findByUserName(loginRequest.getUserName())
                    .orElseThrow(() -> new UsersExceptions("User not found"));
            if(!passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())){
                throw new BadCredentialsException("Wrong password");

            }
            String token = jwtUtils.generateToken(user.getEmail());


        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setMessage("Bearer " + token);
        return loginResponse;

    }

    private static UserRegisterResponse getCreateUserRegisterResponse(RegisterUserRequest request) {
        UserRegisterResponse userRegisterResponse = new UserRegisterResponse();
        userRegisterResponse.setMessage("User registered successfully");
        userRegisterResponse.setStatus("201, created");
        userRegisterResponse.setFirstName(request.getFirstName());
        userRegisterResponse.setLastName(request.getLastName());
        userRegisterResponse.setEmail(request.getEmail());
        return userRegisterResponse;
    }
}
