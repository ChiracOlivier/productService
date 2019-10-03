package com.mycompany.productService.controller;


import com.mycompany.productService.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {


    @GetMapping("/PageAcceuil")
    public String TakeProduct(){
        return "Welcome to me Chirac";
    }
     // Jackson turns POJO's in JSON
    @GetMapping("/Products")
    public List<Product> getProduct(){
       Product myProduct= new Product(1,"salu", 10);
        Product myProducts= new Product(2,"slut", 1000);
        Product myProduc= new Product(3,"salut", 100);
        List<Product> Products = null;
        Products.add(myProduct);
        Products.add(myProducts);
        Products.add(myProduc);

       return Products;
    }
}
