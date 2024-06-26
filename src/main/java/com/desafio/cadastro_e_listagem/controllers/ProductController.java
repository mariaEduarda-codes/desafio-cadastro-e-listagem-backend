package com.desafio.cadastro_e_listagem.controllers;

import com.desafio.cadastro_e_listagem.domain.product.Product;
import com.desafio.cadastro_e_listagem.domain.product.ProductRepository;
import com.desafio.cadastro_e_listagem.domain.product.RequestProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var allProducts = productRepository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody RequestProduct data) {
        Product newProduct = new Product(data);
        System.out.println(data);
        productRepository.save(newProduct);
        return ResponseEntity.ok(newProduct);
    }

}
