package com.example.please.model;

import java.util.List;

import jakarta.persistence.CascadeType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class ProductModel {
    @Id
    private int productID;
    private String productName;
    private int price;
    private String description;
    //getters and setters
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    List<Customer> custs;
    public int getProductID() {
        return productID;
    }
    public void setProductID(int productID) {
        this.productID = productID;
    }
    public List<Customer> getCusts() {
        return custs;
    }
    public void setCusts(List<Customer> custs) {
        this.custs = custs;
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
    public ProductModel(int productID, String productName, int price, String description, List<Customer> custs) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.custs = custs;
    }
    public ProductModel(){
        
    }
}
