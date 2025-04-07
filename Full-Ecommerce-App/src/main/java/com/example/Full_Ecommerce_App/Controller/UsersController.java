package com.example.Full_Ecommerce_App.Controller;

import com.example.Full_Ecommerce_App.DTO.Request.LoginRequest;
import com.example.Full_Ecommerce_App.DTO.Request.RegisterUserRequest;
import com.example.Full_Ecommerce_App.DTO.Response.LoginResponse;
import com.example.Full_Ecommerce_App.DTO.Response.UserRegisterResponse;
import com.example.Full_Ecommerce_App.Data.Model.Users;
import com.example.Full_Ecommerce_App.Services.UsersServices;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Users")
public class UsersController {
    private final UsersServices usersServices;
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }
     @PostMapping("/register")
    public ResponseEntity<UserRegisterResponse> createUser(@Valid @RequestBody RegisterUserRequest request) {
        UserRegisterResponse response = usersServices.CreateUser(request);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    @PostMapping("/Login")
        public ResponseEntity<LoginResponse> Login (@Valid @RequestBody LoginRequest login){
            LoginResponse response = usersServices.Login(login);
            return ResponseEntity.ok(response);
    }
    @GetMapping("All")
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = usersServices.getAllUsers();
        return ResponseEntity.ok(users);
    }

}
