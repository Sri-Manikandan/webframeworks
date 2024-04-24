package com.example.please.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.please.model.Customer;
import com.example.please.repository.CustomerRepo;

@Service
public class CustomerService {
    @Autowired
    CustomerRepo repo;

    public List<Customer> display_all(){
        return repo.display();
    }

    public String post(Customer c){
        repo.save(c);
        return "Customer updated";
    }

    public List<Customer> getall(){
        return repo.findAll();
    }
}
