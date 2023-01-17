package com.poli.miniMarket.modules.compras.domain.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Purchase {

    private Long idCompra;

    private BigDecimal total;

    private String tipoPago;

    private LocalDateTime fecha;

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
}
