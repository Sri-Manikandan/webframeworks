package com.example.please.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.please.model.ProductModel;
import com.example.please.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    public ProductRepo repo;

    //post
    public String addProduct(ProductModel obj) {
        repo.save(obj);
        return "Data inserted";
    }

    //get
    public List<ProductModel> listProduct() {
        return repo.findAll();
    }

    //delete
    public String delete(int id){
        repo.deleteById(id);
        return "Data deleted";
    }

    //update
    public String update(ProductModel obj) {
        ProductModel object= repo.getReferenceById(obj.getProductID());
        repo.save(obj);
        return object.getProductID()+" is success";
    }

    //search by name with jpql
    public ProductModel search(String name) {
        return repo.findByName(name);
    }

    //update by id with jpql
    public String update(String name, int price, int id) {
        repo.updateProduct(name, price, id);
        return "Data updated";
    }
}
