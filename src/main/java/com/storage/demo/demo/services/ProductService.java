/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.storage.demo.demo.services;

import com.storage.demo.demo.models.Product;
import com.storage.demo.demo.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lab
 */
@Service
public class ProductService {
    
  @Autowired
            
  ProductRepository productRepository;  
  
  public List<Product> listAllProducts(){
      return (List<Product>) productRepository.findAll();
  }
  public Product createProduct(Product product){
      return productRepository.save(product);
  }
}
