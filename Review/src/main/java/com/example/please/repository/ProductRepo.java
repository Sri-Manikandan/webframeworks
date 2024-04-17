package com.example.please.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import jakarta.transaction.Transactional;

import com.example.please.model.ProductModel;

@Repository
public interface ProductRepo extends JpaRepository <ProductModel,Integer> {

    @Query("select p from ProductModel p where p.productName = ?1")
    ProductModel findByName(String productName);

    @Transactional
    @Modifying
    @Query("update ProductModel p set p.productName = ?1, p.price = ?2 where p.productID = ?3")
    void updateProduct(String productName, int productPrice, int productId);

}
