package com.poli.miniMarket.modules.producto.domain.repository;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import com.poli.miniMarket.modules.producto.persistence.mapper.ProductMapper;
import com.poli.miniMarket.modules.producto.persistence.repository.ProductCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    public List<Product> getAllServices() {
        List<ProductEntity> entities = (List<ProductEntity>) productCrudRepository.findAll();
        return mapper.toProducts(entities);
    }

    public Optional<Product> getProductByCode(long code) {
        return productCrudRepository.findById(code).map(prod -> mapper.toProduct(prod));
    }

    public Optional<List<Product>> findByName(String name) {
        Optional<List<ProductEntity>> entities = productCrudRepository.findByName(name);
        return entities.map(ents -> {
            return mapper.toProducts(ents);
        });
    }
    public Optional<List<Product>> findByType(String type) {
        Optional<List<ProductEntity>> entities = productCrudRepository.findByType(type);
        return entities.map(ents -> {
            return mapper.toProducts(ents);
        });
    }

    public int updateProduct(boolean status, Long code) {
        return productCrudRepository.updateProductStatus(status, code);
    }
}
