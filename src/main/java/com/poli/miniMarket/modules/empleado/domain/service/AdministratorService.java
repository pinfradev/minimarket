package com.poli.miniMarket.modules.empleado.domain.service;

import com.poli.miniMarket.modules.empleado.domain.dto.Administrator;
import com.poli.miniMarket.modules.empleado.domain.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorService {

    private AdministratorRepository repository;

    @Autowired
    public AdministratorService(AdministratorRepository repository) {
        this.repository = repository;
    }

    public List<Administrator> getAllAdministrators() {
        return repository.getAllAdministrators();
    }
}
