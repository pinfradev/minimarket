package com.poli.miniMarket.modules.producto.domain.service;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.domain.repository.ProductRepository;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import com.poli.miniMarket.modules.producto.persistence.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
}
