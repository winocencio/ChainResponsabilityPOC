package com.winocencio.poc.chain.service;

import com.winocencio.poc.chain.dto.request.PurchaseRequest;
import com.winocencio.poc.chain.dto.response.ValidatorResponse;
import com.winocencio.poc.chain.error.ErrorRule;
import com.winocencio.poc.chain.service.strategy.ServiceStrategy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PurchaseValidatorService {

    public ResponseEntity<ValidatorResponse> validatePurchase(PurchaseRequest purchaseRequest){
        ErrorRule errorRule = ServiceStrategy.getStrategy(purchaseRequest).execute(purchaseRequest);

        if(errorRule != null)
            return new ResponseEntity<ValidatorResponse>(new ValidatorResponse(errorRule.getMessage()),HttpStatus.UNPROCESSABLE_ENTITY);

        return new ResponseEntity<ValidatorResponse>(HttpStatus.OK);
    }

}
