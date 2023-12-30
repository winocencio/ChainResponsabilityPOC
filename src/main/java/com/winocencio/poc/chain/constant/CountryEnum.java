package com.winocencio.poc.chain.constant;

public enum CountryEnum {

    BRAZIL("BR"),
    CHILE("CL");

    private String abbreviation;

    CountryEnum(String abbreviation){
        this.abbreviation = abbreviation;
    }
}
