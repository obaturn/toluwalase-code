package com.example.Full_Ecommerce_App;

import com.example.Full_Ecommerce_App.DTO.Request.CreateProductRequest;
import com.example.Full_Ecommerce_App.DTO.Response.CreateProductResponse;
import com.example.Full_Ecommerce_App.Data.Model.Product;
import com.example.Full_Ecommerce_App.Data.Repository.ProductRepository;
import com.example.Full_Ecommerce_App.Services.ProductServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ProductTest {
    void ContextLoads(){

    }
    @BeforeEach
    void setUp(){
        productRepository.deleteAll();
    }
    @Autowired
    ProductRepository productRepository;

    private ProductServices productServices;

@Test
    public void test_that_i_can_create_a_product() {
         CreateProductRequest request = new CreateProductRequest();
        request.setProductName("iphone 13");
        request.setProductDescription("Iphone 13 new latest iphone");
        request.setProductPrice(new BigDecimal("150.0"));
        request.setProductQuantity(3);

        CreateProductResponse response = productServices.createProduct(request);

        assertNotNull(response);
        assertNotNull(response.getMessage());
        assertEquals("iphone 13", response.getProduct_name());
         assertEquals("Iphone 13 new latest iphone", response.getProduct_description());
    }
    @Test
    public void test_that_i_can_get_all_products() {
    CreateProductRequest request1 = new CreateProductRequest();
        request1.setProductName("Fan");
        request1.setProductDescription("The Fastest fan");
        request1.setProductPrice(new BigDecimal("1150.0"));
        request1.setProductQuantity(5);
        productServices.createProduct(request1);

        CreateProductRequest request2 = new CreateProductRequest();
        request2.setProductName("Kettle");
        request2.setProductDescription("This is a kettle");
        request2.setProductPrice(new BigDecimal("5150.0"));
        request2.setProductQuantity(7);
        productServices.createProduct(request2);

        List<Product> products = productServices.getAllProducts();
        assertNotNull(products);
        assertEquals(2, products.size());
    }
    @Test
public void testThatICanGetProductById() {

    CreateProductRequest request = new CreateProductRequest();
    request.setProductName("Blender");
    request.setProductDescription("A powerful blender");
    request.setProductPrice(new BigDecimal("3200.0"));
    request.setProductQuantity(3);


    productServices.createProduct(request);
    Product savedProduct = productRepository.findProductByProductName("Blender")
            .orElseThrow(() -> new RuntimeException("Product not found"));

    Product retrievedProduct = productServices.getProductById(savedProduct.getProductId());


    assertNotNull(retrievedProduct);
    assertEquals(savedProduct.getProductId(), retrievedProduct.getProductId());
    assertEquals("Blender", retrievedProduct.getProductName());
}

}
