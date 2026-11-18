
package com.example.Productmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Productmanagement.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
