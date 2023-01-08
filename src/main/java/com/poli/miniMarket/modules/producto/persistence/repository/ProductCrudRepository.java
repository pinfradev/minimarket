package com.poli.miniMarket.modules.producto.persistence.repository;

import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Long> {
}
