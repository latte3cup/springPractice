package org.example.service;

import org.example.model.product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<product> products = new ArrayList<>();

    public void addProduct(product p){
        products.add(p);
    }

    public List<product> findAll(){
        return products;
    }
}
