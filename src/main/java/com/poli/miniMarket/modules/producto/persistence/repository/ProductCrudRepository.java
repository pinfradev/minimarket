package com.poli.miniMarket.modules.producto.persistence.repository;

import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Long> {

    Optional<List<ProductEntity>> findByName(String name);
    Optional<List<ProductEntity>> findByType(String type);
    @Transactional
    @Modifying
    @Query(value="update ProductEntity p set p.active = :isActive where p.code= :code")
    int updateProductStatus(@Param("isActive") boolean isActive, @Param("code")long code);
}
