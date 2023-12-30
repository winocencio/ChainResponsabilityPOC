package com.winocencio.poc.chain.service.strategy;

import com.winocencio.poc.chain.constant.CountryEnum;
import com.winocencio.poc.chain.constant.PaymentMethodEnum;
import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.error.ErrorRule;
import com.winocencio.poc.chain.rule.ValidationRule;
import com.winocencio.poc.chain.service.strategy.ServiceStrategy;

import java.util.List;

public class ChileCashService implements ServiceStrategy {
    @Override
    public boolean isEligible(PurchaseRequest purchaseRequest) {
        return CountryEnum.CHILE.equals(purchaseRequest.getPurchaseCountryEnum()) &&
                PaymentMethodEnum.CASH.equals(purchaseRequest.getPaymentMethodEnum());
    }
    @Override
    public List<ValidationRule> getValidationRuleList() {
        return null;
    }

    @Override
    public ErrorRule execute(PurchaseRequest purchaseRequest) {
        return null;
    }
}
