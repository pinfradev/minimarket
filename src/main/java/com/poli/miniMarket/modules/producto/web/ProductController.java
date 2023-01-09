package com.poli.miniMarket.modules.producto.web;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.domain.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;
import java.util.Optional;

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
            System.out.println("estaActivo: " + product.getActive());
            if (product.getActive() == null) {
                product.setActive(true);
            }
            return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path="all")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping(path = "/{code}")
    public ResponseEntity<Product> getByCode(@PathVariable long code) {
        return productService.getProductByCode(code).map(prod -> {
            return new ResponseEntity(prod, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(path = "/search")
    public ResponseEntity<List<Product>> getByName(@RequestParam(name = "name") String name) {
        return productService.findByName(name).map(prod -> {
            return new ResponseEntity(prod, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping(path = "/search/type")
    public ResponseEntity<List<Product>> getByType(@RequestParam(name = "type") String type) {
        return productService.findByType(type).map(prod -> {
            return new ResponseEntity(prod, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PatchMapping(path= "/update/{code}")
    public ResponseEntity<String> updateStatus(@RequestParam(name="active") boolean active, @PathVariable Long code) {
        int updated = productService.updateProduct(active, code);
        return new ResponseEntity("updated registers: " + updated, HttpStatus.OK);
    }

    @PutMapping(path="/update/{code}")
    public ResponseEntity<Product> updateProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping(path="delete/{code}")
    public ResponseEntity<String> deleteProduct(@PathVariable long code) {
        final String successMessage = "Deleted successfully";
        final String errorMessage = "Could not delete product with id " + code;
        if (productService.getProductByCode(code).isPresent()) {
            boolean wasDeleted = productService.deleteProduct(code);
            String message =  wasDeleted ? successMessage : errorMessage;
            HttpStatus statusCode = wasDeleted ? HttpStatus.OK : HttpStatus.NOT_FOUND;
            return new ResponseEntity<>(message, statusCode);
        } else {
            return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
        }
    }
}
