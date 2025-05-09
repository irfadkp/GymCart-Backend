package com.gymcart.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private String category;

    //Default constructor for JPA
    public  Product(){}

    //Constructor for Convenience
    public  Product(String name,double price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //Getters and setters
    public  Long getId(){
        return  id;
    }

    public  void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public  double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public  String getCategory(){
        return  category;
    }

    public  void setPrice(String category){
        this.category = category;
    }
}
