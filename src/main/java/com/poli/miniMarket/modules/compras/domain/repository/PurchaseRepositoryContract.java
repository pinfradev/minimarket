package com.poli.miniMarket.modules.compras.domain.repository;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;

public interface PurchaseRepositoryContract {

    public Purchase save(Purchase purchase);

}
