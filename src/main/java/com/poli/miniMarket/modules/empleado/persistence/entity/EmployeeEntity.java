package com.poli.miniMarket.modules.empleado.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "empleados")
public class EmployeeEntity extends AdministratorBaseEntity {

    @ManyToOne
    @JoinColumn(name = "cedula_administrador", insertable = false, updatable = false)
    private AdministratorEntity administrator;

    public AdministratorEntity getAdministratorId() {
        return administrator;
    }

    public void setAdministratorId(AdministratorEntity administrator) {
        this.administrator = administrator;
    }
}
