package com.mycompany.productService.entities;

import lombok.Data;

@Data
public class Product {

    private Integer id;
    private String name;
    private int price;

    public Product(){

    }

    public Product(Integer id, String name, int price) {
        super();
        this.id = id;
        this.name=name;
        this.price=price;
    }
}
