package com.poli.miniMarket.modules.compras.persistence.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Compras")
public class PurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_compra")
    private Long idCompra;

    @Column(name = "total")
    private BigDecimal total;

    @Column(name = "tipo_pago")
    private String tipoPago;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "cliente_cedula")
    private Long clienteCedula;

    public Long getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Long idCompra) {
        this.idCompra = idCompra;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Long getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(Long clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    @Override
    public java.lang.String toString() {
        return "PurchaseEntity{" +
                "idCompra=" + idCompra +
                ", total=" + total +
                ", tipoPago=" + tipoPago +
                ", fecha=" + fecha +
                ", clienteCedula=" + clienteCedula +
                '}';
    }
}
