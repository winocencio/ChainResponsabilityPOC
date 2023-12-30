package com.winocencio.poc.chain.service.strategy;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.error.ErrorRule;
import com.winocencio.poc.chain.rule.ValidationRule;

import java.util.Arrays;
import java.util.List;

public interface ServiceStrategy {

    boolean isEligible(PurchaseRequest purchaseRequest);
    ErrorRule execute(PurchaseRequest purchaseRequest);

    ValidationRule getValidationRuleChain();

    static List<ServiceStrategy> getRuleServiceStrategyList(){
        return Arrays.asList(new BrazilCashService(),
                new BrazilCreditCardService(),
                new ChileCashService(),
                new PixService());
    }

    static ServiceStrategy getStrategy(PurchaseRequest purchaseRequest){
        return getRuleServiceStrategyList().stream()
                .filter(serviceStrategy -> serviceStrategy.isEligible(purchaseRequest))
                .findFirst()
                .orElse(new DefaultStrategyService());
    }
}
