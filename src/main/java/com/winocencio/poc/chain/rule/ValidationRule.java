package com.winocencio.poc.chain.rule;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;

public abstract class ValidationRule {

    private ValidationRule next;

    protected ValidationRule(ValidationRule next) {
        this.next = next;
    }

    protected boolean isValidNext(PurchaseRequest purchaseRequest) {
        if (next == null)
            return true;
        return next.isValid(purchaseRequest);
    }

    public abstract Boolean isValid(PurchaseRequest purchaseRequest);
}
