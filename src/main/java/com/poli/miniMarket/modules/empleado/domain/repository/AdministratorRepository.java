package com.poli.miniMarket.modules.empleado.domain.repository;

import com.poli.miniMarket.modules.empleado.domain.dto.Administrator;
import com.poli.miniMarket.modules.empleado.persistence.entity.AdministratorEntity;
import com.poli.miniMarket.modules.empleado.persistence.mapper.AdministratorMapper;
import com.poli.miniMarket.modules.empleado.persistence.repository.AdministratorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdministratorRepository {

    private AdministratorCrudRepository administratorCrudRepository;
    private AdministratorMapper mapper;
    @Autowired
    public AdministratorRepository(
            AdministratorCrudRepository administratorCrudRepository,
            AdministratorMapper mapper
    ) {
        this.administratorCrudRepository = administratorCrudRepository;
        this.mapper = mapper;
    }

    public List<Administrator> getAllAdministrators() {
        return mapper.toAdministrators((List<AdministratorEntity>)administratorCrudRepository.findAll());
    }
}
