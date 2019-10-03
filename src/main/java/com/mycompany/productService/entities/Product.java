package com.mycompany.productService.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
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
