package com.poli.miniMarket.modules.compras.domain.repository;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;
import com.poli.miniMarket.modules.compras.persistence.entity.PurchaseEntity;
import com.poli.miniMarket.modules.compras.persistence.mapper.PurchaseMapper;
import com.poli.miniMarket.modules.compras.persistence.repository.PurchaseCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PurchaseRepository implements PurchaseRepositoryContract{


    private PurchaseCrudRepository purchaseCrudRepository;
    private PurchaseMapper purchaseMapper;

    @Autowired
    public PurchaseRepository(PurchaseCrudRepository purchaseCrudRepository, PurchaseMapper purchaseMapper) {
        this.purchaseCrudRepository = purchaseCrudRepository;
        this.purchaseMapper = purchaseMapper;
    }

    @Override
    public Purchase save(Purchase purchase) {
        PurchaseEntity purchaseEntity = purchaseMapper.toPurchaseEntity(purchase);
        PurchaseEntity savePurchase = purchaseCrudRepository.save(purchaseEntity);
        return purchase;
    }

    @Override
    public List<Purchase> getAllPurchases() {
        List<PurchaseEntity> purchases = (List<PurchaseEntity>) purchaseCrudRepository.findAll();
        return purchaseMapper.toPurchases(purchases);
    }


}
