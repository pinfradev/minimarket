package com.poli.miniMarket.modules.producto.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductEntity {

    @Id
    @Column(name = "codigo")
    private Long code;

    @Column(name = "nombre")
    private String name;

    @Column(name = "cantidad")
    private Integer quantity;

    @Column(name = "tipo")
    private String type;

    @Column(name="is_active")
    private Boolean active;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}
