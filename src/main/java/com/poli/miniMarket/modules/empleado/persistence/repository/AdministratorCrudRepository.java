package com.poli.miniMarket.modules.empleado.persistence.repository;

import com.poli.miniMarket.modules.empleado.persistence.entity.AdministratorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdministratorCrudRepository extends CrudRepository<AdministratorEntity, Long> {
}
