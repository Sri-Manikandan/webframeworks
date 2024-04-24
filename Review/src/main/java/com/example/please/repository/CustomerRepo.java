package com.example.please.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.please.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
    @Query("select c,p from Customer c join c.prods p")
    public List<Customer> display();
}
