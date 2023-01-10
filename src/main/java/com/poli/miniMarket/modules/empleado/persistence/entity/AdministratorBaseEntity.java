package com.poli.miniMarket.modules.empleado.persistence.entity;

import jakarta.persistence.*;

import java.util.List;

@MappedSuperclass
public class AdministratorBaseEntity {
    @Id
    @Column(name = "cedula")
    private Integer idNumber;

    @Column(name = "nombre")
    protected String name;

    @Column(name = "apellido")
    protected String surname;

    @Column(name = "cargo")
    protected String position;

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
