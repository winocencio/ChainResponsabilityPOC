package com.winocencio.poc.chain.dto.request;

import com.winocencio.poc.chain.constant.CountryEnum;
import com.winocencio.poc.chain.constant.CurrencyEnum;
import com.winocencio.poc.chain.constant.PaymentMethodEnum;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PurchaseRequest {

    private CountryEnum purchaseCountryEnum;
    private PaymentMethodEnum paymentMethodEnum;
    private LocalDate purchaseDate;
    private BigDecimal purchaseValue;
    private CurrencyEnum purchaseCurrencyEnum;
    private Short installments;

}
