package com.example.please.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.please.model.ProductModel;
import com.example.please.service.ProductService;

@RestController
public class ProductController {
    @Autowired
    public ProductService service;

    //Basic CRUD operations
    @GetMapping("/listProduct")
    public List<ProductModel> listProduct(){
        return service.listProduct();
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody ProductModel obj){
        return service.addProduct(obj);
    }

    @DeleteMapping("/delete/{id}")
    public String delete_data(@PathVariable int id){
        return service.delete(id);
    }

    @PutMapping("/update")
    public String update(@RequestBody ProductModel obj){
        return service.update(obj);
    }


    //Custom queries
    @GetMapping("/search/{name}")
    public ProductModel search(@PathVariable String name){
        return service.search(name);
    }

    @PutMapping("/update/{name}/{price}/{id}")
    public String update(@PathVariable String name, @PathVariable int price, @PathVariable int id){
        return service.update(name, price, id);
    }
}
