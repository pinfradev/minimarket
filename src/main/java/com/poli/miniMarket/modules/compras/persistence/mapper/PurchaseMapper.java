package com.poli.miniMarket.modules.compras.persistence.mapper;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;
import com.poli.miniMarket.modules.compras.persistence.entity.PurchaseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    public Purchase toPurchase(PurchaseEntity entity);

    List<Purchase> toPurchases(List<PurchaseEntity> entities);

    public PurchaseEntity toPurchaseEntity(Purchase purchase);

}
