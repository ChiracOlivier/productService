package com.mycompany.productService.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/PageAcceuil")
    public String TakeProduct(){
        return "Welcome to me Chirac";
    }

    @GetMapping("/Products")
    public Product getProduct(){

    }
}
