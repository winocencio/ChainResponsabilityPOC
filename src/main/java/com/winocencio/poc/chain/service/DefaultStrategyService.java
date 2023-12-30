package com.winocencio.poc.chain.service;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.rule.ValidationRule;
import com.winocencio.poc.chain.strategy.ServiceStrategy;

import java.util.List;

public class DefaultStrategyService implements ServiceStrategy {
    @Override
    public boolean isEligible(PurchaseRequest purchaseRequest) {
        return false;
    }
    @Override
    public List<ValidationRule> getErrorRuleList() {
        return null;
    }

    @Override
    public boolean execute(PurchaseRequest purchaseRequest) {
        return false;
    }
}
