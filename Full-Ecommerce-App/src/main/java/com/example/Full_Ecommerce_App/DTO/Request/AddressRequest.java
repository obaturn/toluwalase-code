package com.example.Full_Ecommerce_App.DTO.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequest {
         @NotBlank(message = "street is required pls input your street address")
        private String street;
        @NotBlank(message = "city is required pls input your street name ")
        private String city;
        @NotBlank(message = "state is required pls input state")
        private String state;
        @NotBlank(message = "state Zip code is required pls input state Zip code")
        private String zip;
        @NotBlank(message= "Country can note be left empty pls input your country name ")
        private String country;
}
