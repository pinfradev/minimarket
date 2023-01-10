package com.poli.miniMarket.modules.empleado.domain.dto;

public class Administrator {

    protected Integer idNumber;

    protected String name;

    protected String surname;

    protected String position;

    public Integer getIdNumber() {
        return idNumber;
    }

    public Administrator(Integer idNumber, String name, String surname, String position) {
        this.idNumber = idNumber;
        this.name = name;
        this.surname = surname;
        this.position = position;
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
