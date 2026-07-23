package com.paridhi.SpringJpa.Hibernate.controller;

import com.paridhi.SpringJpa.Hibernate.entities.Product;
import com.paridhi.SpringJpa.Hibernate.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;
    private static final int PAGE_SIZE = 5;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<Product> getAllProducts(
            @RequestParam(defaultValue = "0") Integer pageNumber) {

        Pageable pageable = PageRequest.of(pageNumber, PAGE_SIZE);
        return productRepository.findAll(pageable).getContent();
    }
}