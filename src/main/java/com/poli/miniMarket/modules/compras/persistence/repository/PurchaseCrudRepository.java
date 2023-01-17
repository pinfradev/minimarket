package com.poli.miniMarket.modules.compras.persistence.repository;

import com.poli.miniMarket.modules.compras.persistence.entity.PurchaseEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PurchaseCrudRepository extends CrudRepository<PurchaseEntity, Long> {

    Optional<List<PurchaseEntity>> findByClienteCedula(String ced);

}
