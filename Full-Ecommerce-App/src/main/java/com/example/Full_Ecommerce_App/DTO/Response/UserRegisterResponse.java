package com.example.Full_Ecommerce_App.DTO.Response;

import lombok.Getter;
import lombok.Setter;

public class UserRegisterResponse {
      private String message;
        private String status;
        private String lastName;
        private String firstName;
        private String email;

        public String getMessage(){
            return message;
        }
        public void setMessage(String message){
            this.message = message;
        }
        public String getStatus() {
            return status;
        }
        public void setStatus(String status) {
            this.status = status;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
}
