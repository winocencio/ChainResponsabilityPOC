package com.winocencio.poc.chain.controller;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.dto.response.ValidatorResponse;
import com.winocencio.poc.chain.service.PurchaseValidatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseValidatorController {

    @Autowired
    private PurchaseValidatorService purchaseValidatorService;

    @PostMapping("/validate")
    public ResponseEntity<ValidatorResponse> validatePurchase(@RequestBody PurchaseRequest purchaseRequest){
        return purchaseValidatorService.validatePurchase(purchaseRequest);
    }
}
