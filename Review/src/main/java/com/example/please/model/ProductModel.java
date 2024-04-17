package com.example.please.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductModel {
    @Id
    private int productID;
    private String productName;
    private int price;
    private String description;

    //getters and setters
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //constructors
    public ProductModel(int productID, String productName, int price, String description) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }
    public ProductModel(){
        
    }
}
