package com.mycompany.productService.controller;


import com.mycompany.productService.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/PageAcceuil")
    public String TakeProduct(){
        return "Welcome to me Chirac";
    }
     // Jackson turns POJO's in JSON
    @GetMapping("/Products")
    public Product getProduct(){
       Product myProduct= new Product(1,"salut", 100);
       return myProduct;
    }
}
