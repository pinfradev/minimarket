package com.poli.miniMarket.modules.producto.persistence.mapper;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    public Product toProduct(ProductEntity entity);

    List<Product> toProducts(List<ProductEntity> entities);

    public ProductEntity toProductEntity(Product product);
}
