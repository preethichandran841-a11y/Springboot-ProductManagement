
package com.example.Productmanagement.service;

import org.springframework.stereotype.Service;
import com.example.Productmanagement.entity.Product;
import com.example.Productmanagement.repository.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
