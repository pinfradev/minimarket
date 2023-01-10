package com.poli.miniMarket.modules.empleado.web;

import com.poli.miniMarket.modules.empleado.domain.dto.Administrator;
import com.poli.miniMarket.modules.empleado.domain.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping(path = "/administrators")
public class AdministratorController {

    private AdministratorService service;

    @Autowired
    public AdministratorController(AdministratorService service) {
        this.service = service;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Administrator>> getAllAdministrators() {
        return new ResponseEntity<>(service.getAllAdministrators(), HttpStatus.OK);
    }
}
