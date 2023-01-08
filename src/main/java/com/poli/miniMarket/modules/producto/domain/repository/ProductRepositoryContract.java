package com.poli.miniMarket.modules.producto.domain.repository;

import com.poli.miniMarket.modules.producto.domain.dto.Product;

public interface ProductRepositoryContract {

    public Product save(Product product);
}
