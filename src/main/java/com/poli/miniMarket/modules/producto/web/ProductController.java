package com.poli.miniMarket.modules.producto.web;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }



    @PostMapping(path = "/save")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        if (product.getCode() < Integer.MAX_VALUE) {
            return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
