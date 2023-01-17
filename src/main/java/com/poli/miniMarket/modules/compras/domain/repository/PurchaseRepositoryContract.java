package com.poli.miniMarket.modules.compras.domain.repository;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;

import java.util.List;

public interface PurchaseRepositoryContract {

    public Purchase save(Purchase purchase);

    public List<Purchase> getAllPurchases();

}
