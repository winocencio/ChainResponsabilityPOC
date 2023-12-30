package com.winocencio.poc.chain.rule;

import com.winocencio.poc.chain.constant.CurrencyEnum;
import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.error.ErrorRule;

public class CurrencyRealValidationRule extends ValidationRule {

    public CurrencyRealValidationRule(ValidationRule next) {
        super(next);
    }

    @Override
    public ErrorRule isValid(PurchaseRequest purchaseRequest) {
        if(!CurrencyEnum.REAL.equals(purchaseRequest.getPurchaseCurrencyEnum()))
            return new ErrorRule("Only Currency Real is allowed.");

        return isValidNext(purchaseRequest);
    }

}
