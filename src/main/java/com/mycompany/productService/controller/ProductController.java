package com.mycompany.productService.controller;


import com.mycompany.productService.entities.Product;
import com.mycompany.productService.services.ProductJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    public ProductJPARepository Productservice;

    @GetMapping("/PageAcceuil")
    public String TakeProduct(){
        return "Welcome to me Chirac";
    }
     // Jackson turns POJO's in JSON
    @GetMapping("/Products")
    public List<Product> getProduct(){

       return Productservice.findAll();
    }

    @GetMapping("/Products/{Id}")
    public Product getProductById(@PathVariable int Id){
        return Productservice.findById(Id).get();
    }
    @DeleteMapping("/Products/{Id}")
    public  String deleteProductById(@PathVariable int Id){
          Productservice.deleteById(Id);
          return "good delete";
    }
    @PostMapping("/Products")
    public String addNewProduct(@RequestBody Product product){
        Productservice.save(product);
        return "good save";
    }
}
