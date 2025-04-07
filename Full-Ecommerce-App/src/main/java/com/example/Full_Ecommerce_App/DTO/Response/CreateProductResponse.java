package com.example.Full_Ecommerce_App.DTO.Response;

import lombok.Getter;
import lombok.Setter;


public class CreateProductResponse {
     private String message;
    private String product_name;
    private String product_description;

    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }
    public String getProduct_description() {
        return product_description;
    }


}
