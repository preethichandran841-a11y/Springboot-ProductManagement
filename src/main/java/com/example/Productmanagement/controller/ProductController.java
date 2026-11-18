
package com.example.Productmanagement.controller;

import org.springframework.web.bind.annotation.*;
import com.example.Productmanagement.entity.Product;
import com.example.Productmanagement.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
