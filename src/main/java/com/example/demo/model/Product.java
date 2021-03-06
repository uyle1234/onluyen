package com.example.demo.model;

import javax.persistence.*;

@Table
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int price;
    @ManyToOne
    private Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Product() {
    }

    public Product(int id, String name, Category category,int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

