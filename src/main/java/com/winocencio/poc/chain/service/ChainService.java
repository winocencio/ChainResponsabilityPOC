package com.winocencio.poc.chain.service;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.strategy.ServiceStrategy;

public class ChainService {

    public void startChain(PurchaseRequest purchaseRequest){
        ServiceStrategy.getStrategy(purchaseRequest).execute(purchaseRequest);
    }

}
