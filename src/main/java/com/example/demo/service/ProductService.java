package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    public  void crateProduct() {

        Category category = categoryRepository.findById(1L).orElseThrow(() -> new RuntimeException("Category not found"));

        Product product = new Product();

        product.setTitle("new Test");
        product.setCategory(category);

        productRepository.save(product);
    }




}
