package com.example.please.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.please.model.Customer;
import com.example.please.service.CustomerService;

@RestController
public class CustomerController {
    @Autowired
    CustomerService service;

    @GetMapping("/display-all")
    public List<Customer> display(){
        return service.display_all();
    }

    @PostMapping("/postcustomer")
    public String post(@RequestBody Customer c){
        return service.post(c);
    }

    @GetMapping("/getcustomers")
    public List<Customer> getall(){
        return service.getall();
    }
}
