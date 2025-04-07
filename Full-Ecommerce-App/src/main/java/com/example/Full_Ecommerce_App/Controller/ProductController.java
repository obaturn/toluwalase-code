package com.example.Full_Ecommerce_App.Controller;

import com.example.Full_Ecommerce_App.DTO.Request.CreateProductRequest;
import com.example.Full_Ecommerce_App.DTO.Response.CreateProductResponse;
import com.example.Full_Ecommerce_App.Data.Model.Product;
import com.example.Full_Ecommerce_App.Services.ProductServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Products")
public class ProductController {
    private final ProductServices productServices;
    public ProductController(ProductServices productServices) {
        this.productServices = productServices;
    }
@PostMapping("Create")
    @PreAuthorize("hasAuthority('SELLER')")
    public ResponseEntity<CreateProductResponse> createProduct(@RequestBody CreateProductRequest createProductRequest) {
        CreateProductResponse product = productServices.createProduct(createProductRequest);
        return new ResponseEntity<>(product, HttpStatus.CREATED);

    }
    @GetMapping("All")
    @PreAuthorize("hasAnyAuthority('ADMIN','CUSTOMER')")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productServices.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAnyAuthority('ADMIN', 'CUSTOMER')")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productServices.getProductById(id);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id) {
        productServices.deleteProduct(id);
        return ResponseEntity.ok("Product deleted successfully");
    }

}
