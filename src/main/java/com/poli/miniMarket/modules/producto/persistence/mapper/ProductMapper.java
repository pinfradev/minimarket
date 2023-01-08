package com.poli.miniMarket.modules.producto.persistence.mapper;

import com.poli.miniMarket.modules.producto.domain.dto.Product;
import com.poli.miniMarket.modules.producto.persistence.entity.ProductEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "code", target = "code"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "type", target = "type")
    })
    public Product toProduct(ProductEntity entity);

    @InheritInverseConfiguration
    public ProductEntity toProductEntity(Product product);
}
