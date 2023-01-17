package com.poli.miniMarket.modules.compras.domain.service;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;
import com.poli.miniMarket.modules.compras.domain.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {

    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    public Purchase save(Purchase purchase) {
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> getAll() {
        return purchaseRepository.getAllPurchases();
    }

    public Optional<List<Purchase>> getAllByClientIdentification(String identification) {
        return purchaseRepository.getAllByClient(identification);
    }

}
