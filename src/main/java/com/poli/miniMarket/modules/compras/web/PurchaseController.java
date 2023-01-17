package com.poli.miniMarket.modules.compras.web;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;
import com.poli.miniMarket.modules.compras.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/purchases")
public class PurchaseController {

    private PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Purchase> savePurchase(@RequestBody PurchaseRequest request) {
        return new ResponseEntity<>(purchaseService.save(buildPurchase(request)), HttpStatus.CREATED);
    }

    private Purchase buildPurchase(PurchaseRequest request) {
        Purchase purchase = new Purchase();
        purchase.setTotal(request.getTotal());
        purchase.setTipoPago(request.getTipoPago());
        purchase.setFecha(request.getFecha());
        purchase.setClienteCedula(request.getClienteCedula());
        return purchase;
    }

}
