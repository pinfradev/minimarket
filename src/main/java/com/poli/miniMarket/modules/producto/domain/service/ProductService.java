package com.poli.miniMarket.modules.producto.domain.service;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.domain.repository.ProductRepository;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import com.poli.miniMarket.modules.producto.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(
            ProductRepository productRepository
    ) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {

        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.getAllServices();
    }

    public Optional<Product> getProductByCode(long code) {
        return productRepository.getProductByCode(code);
    }

    public Optional<List<Product>> findByName(String name) {
        return productRepository.findByName(name);
    }
    public Optional<List<Product>> findByType(String type) {
        return productRepository.findByType(type);
    }

    public int updateProduct(boolean status, Long code) {
        return productRepository.updateProduct(status, code);
    }
}
