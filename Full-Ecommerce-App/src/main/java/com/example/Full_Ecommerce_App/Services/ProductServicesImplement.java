package com.example.Full_Ecommerce_App.Services;

import com.example.Full_Ecommerce_App.DTO.Request.CreateProductRequest;
import com.example.Full_Ecommerce_App.DTO.Response.CreateProductResponse;
import com.example.Full_Ecommerce_App.Data.Model.Product;
import com.example.Full_Ecommerce_App.Data.Repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesImplement implements ProductServices {

    private final ModelMapper modelMapper;
    private final ProductRepository productRepository;

    @Autowired
    public ProductServicesImplement(ModelMapper modelMapper,
                                    ProductRepository productRepository) {
        this.modelMapper = modelMapper;
        this.productRepository = productRepository;
    }


    @Override
    public CreateProductResponse createProduct(CreateProductRequest request) {

                Product product = modelMapper.map(request, Product.class);
        Product savedProduct = productRepository.save(product);
        return getCreateProductResponse(savedProduct);

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found With id: " + id));
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(()-> new RuntimeException("Product not found With id: " + id));

            productRepository.delete(product);
    }
    private CreateProductResponse getCreateProductResponse(Product product) {
        CreateProductResponse response = new CreateProductResponse();
        response.setMessage("Product created successfully");
        response.setProduct_name(product.getProductName());
        response.setProduct_description(product.getProductDescription());
        return response;
    }
}
