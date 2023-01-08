package com.poli.miniMarket.modules.producto.domain.repository;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import com.poli.miniMarket.modules.producto.persistence.mapper.ProductMapper;
import com.poli.miniMarket.modules.producto.persistence.repository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository implements ProductRepositoryContract{

    private ProductCrudRepository productCrudRepository;
    private ProductMapper mapper;

    @Autowired
    public ProductRepository(
            ProductCrudRepository productCrudRepository,
            ProductMapper mapper
    ) {
        this.productCrudRepository = productCrudRepository;
        this.mapper = mapper;
    }

    @Override
    public Product save(Product product) {
        ProductEntity entity = mapper.toProductEntity(product);
        ProductEntity savedEntity = productCrudRepository.save(entity);
        return  product;
    }
}
