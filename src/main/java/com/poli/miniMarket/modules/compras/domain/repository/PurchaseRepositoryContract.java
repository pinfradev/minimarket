package com.poli.miniMarket.modules.compras.domain.repository;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepositoryContract {

    Purchase save(Purchase purchase);

    List<Purchase> getAllPurchases();

    Optional<List<Purchase>> getAllByClient(String identification);

}
