package com.winocencio.poc.chain.rule;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;

public class CurrencyRealValidationRule extends ValidationRule {

    CurrencyRealValidationRule(ValidationRule next) {
        super(next);
    }

    @Override
    public Boolean isValid(PurchaseRequest purchaseRequest) {


        return isValidNext(purchaseRequest);
    }

}
