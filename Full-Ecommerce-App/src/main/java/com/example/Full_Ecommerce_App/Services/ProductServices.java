package com.example.Full_Ecommerce_App.Services;

import com.example.Full_Ecommerce_App.DTO.Request.CreateProductRequest;
import com.example.Full_Ecommerce_App.DTO.Response.CreateProductResponse;
import com.example.Full_Ecommerce_App.Data.Model.Product;

import java.util.List;

public interface ProductServices {
    CreateProductResponse createProduct(CreateProductRequest request);
    List<Product> getAllProducts();
     Product getProductById(Long id);
     void deleteProduct(Long id);
}
