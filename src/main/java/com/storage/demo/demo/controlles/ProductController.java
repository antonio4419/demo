/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.storage.demo.demo.controlles;

import com.storage.demo.demo.models.Product;
import com.storage.demo.demo.services.ProductService;

import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lab
 */
@RestController
@RequestMapping("/producto")

public class ProductController {
    @Autowired
    
    ProductService productService;
    
    //@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping()
    public List<Product> product(){
          System.out.println(" GET >>");
        return this.productService.listAllProducts();
    }

  

     @PostMapping()
    public Product producto(@RequestBody Product pp) {
        System.out.println(" AQUI >>");
        System.out.println(pp.getNombre());
        
        return  this.productService.createProduct(pp);
    }
    
}
