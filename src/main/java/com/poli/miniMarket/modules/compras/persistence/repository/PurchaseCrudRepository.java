package com.poli.miniMarket.modules.compras.persistence.repository;

import com.poli.miniMarket.modules.compras.persistence.entity.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseCrudRepository extends CrudRepository<PurchaseEntity, Long> {

}
