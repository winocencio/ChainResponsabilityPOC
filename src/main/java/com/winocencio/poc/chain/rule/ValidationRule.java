package com.winocencio.poc.chain.rule;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.error.ErrorRule;

public abstract class ValidationRule {

    private ValidationRule next;

    protected ValidationRule(ValidationRule next) {
        this.next = next;
    }

    protected ErrorRule isValidNext(PurchaseRequest purchaseRequest) {
        if (next == null)
            return null;
        return next.isValid(purchaseRequest);
    }

    public abstract ErrorRule isValid(PurchaseRequest purchaseRequest);
}
