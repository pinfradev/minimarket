package com.poli.miniMarket.modules.compras.web;

import com.poli.miniMarket.modules.compras.domain.dto.Purchase;
import com.poli.miniMarket.modules.compras.domain.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

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

    @GetMapping(path = "/all")
    public ResponseEntity<List<Purchase>> getAll() {
        return new ResponseEntity<>(purchaseService.getAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/client")
    public ResponseEntity<Optional<List<Purchase>>> getAllPurchasesByClient(@RequestParam String ced) {
        return new ResponseEntity<>(purchaseService.getAllByClientIdentification(ced), HttpStatus.OK);
    }

    private Purchase buildPurchase(PurchaseRequest request) {
        Purchase purchase = new Purchase();
        purchase.setTotal(request.getTotal());
        purchase.setTipoPago(request.getTipoPago());
        purchase.setFecha(LocalDateTime.now());
        purchase.setClienteCedula(request.getClienteCedula());
        return purchase;
    }

}
