package com.example.Full_Ecommerce_App.Data.Repository;

import com.example.Full_Ecommerce_App.Data.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
     Optional<Product> findProductByProductName(String ProductName);
}
