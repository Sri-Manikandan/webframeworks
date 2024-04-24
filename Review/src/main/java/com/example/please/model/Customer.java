package com.example.please.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "customer")
    List<ProductModel> prods;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Customer(int id, String firstname, String lastname, List<ProductModel> prods) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.prods = prods;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public Customer(){
        
    }

    public List<ProductModel> getProds() {
        return prods;
    }

    public void setProds(List<ProductModel> prods) {
        this.prods = prods;
    }
}
