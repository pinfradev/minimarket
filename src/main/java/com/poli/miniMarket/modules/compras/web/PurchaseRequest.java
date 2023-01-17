package com.poli.miniMarket.modules.compras.web;

import org.springframework.lang.NonNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PurchaseRequest {

    @NonNull
    private BigDecimal total;

    @NonNull
    private String tipoPago;

    @NonNull
    private LocalDateTime fecha;

    @NonNull
    private Long clienteCedula;

    @NonNull
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(@NonNull BigDecimal total) {
        this.total = total;
    }

    @NonNull
    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(@NonNull String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @NonNull
    public LocalDateTime getFecha() {
        return LocalDateTime.now();
    }

    public void setFecha(@NonNull LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @NonNull
    public Long getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(@NonNull Long clienteCedula) {
        this.clienteCedula = clienteCedula;
    }
}
