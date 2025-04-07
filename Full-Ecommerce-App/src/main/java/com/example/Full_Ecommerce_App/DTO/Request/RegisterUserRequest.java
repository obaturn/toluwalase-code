package com.example.Full_Ecommerce_App.DTO.Request;

import com.example.Full_Ecommerce_App.Data.Model.Roles;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.util.List;

public class RegisterUserRequest {

    @NotBlank(message = "first name can not be empty pls input a value")
    private String firstName;

    @NotBlank(message = "last name can not be empty")
    private String lastName;

    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Phone number can not be left empty")
    @Pattern(regexp = "^\\+?[0-9]{10,15}$", message = "Invalid phone number format")
    private String phoneNumber;

    private List<AddressRequest> addressesRequest;

    private Roles roles;

    @NotBlank(message = "password cant be empty")
    private String password;

    @NotBlank(message = "userName can not be empty")
    private String userName;

    // Manually added getter and setter for firstName
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Manually added getter and setter for lastName
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Manually added getter and setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Manually added getter and setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Manually added getter and setter for addressesRequest
    public List<AddressRequest> getAddressesRequest() {
        return addressesRequest;
    }

    public void setAddressesRequest(List<AddressRequest> addressesRequest) {
        this.addressesRequest = addressesRequest;
    }

    // Manually added getter and setter for roles
    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    // Manually added getter and setter for password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Manually added getter and setter for userName
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
