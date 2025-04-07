package com.example.Full_Ecommerce_App.Services;

import com.example.Full_Ecommerce_App.DTO.Request.LoginRequest;
import com.example.Full_Ecommerce_App.DTO.Request.RegisterUserRequest;
import com.example.Full_Ecommerce_App.DTO.Response.LoginResponse;
import com.example.Full_Ecommerce_App.DTO.Response.UserRegisterResponse;
import com.example.Full_Ecommerce_App.Data.Model.Users;

import java.util.List;

public interface UsersServices {
    UserRegisterResponse CreateUser (RegisterUserRequest usersRequest);
    List<Users> getAllUsers();
    LoginResponse Login (LoginRequest loginRequest);
}
