package com.mycompany.productService.services;

import com.mycompany.productService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJPARepository extends JpaRepository<Product,Integer> {
}
