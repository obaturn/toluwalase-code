package com.example.Full_Ecommerce_App.DTO.Response;

import lombok.Getter;
import lombok.Setter;


public class LoginResponse {
    private String token;
    private String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
}
