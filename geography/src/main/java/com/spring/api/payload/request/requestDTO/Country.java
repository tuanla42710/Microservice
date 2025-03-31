package com.spring.api.payload.request.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Country {

    private String code;

    private String name;

    private String continent;

    private String region;

    private double surfaceArea;

    private int indepYear;

    private int population;

    private double lifeExpectancy;

    private double gnp;

    private double gnpold;

    private String localName;

    private String governmentForm;

    private String headOfState;

    private int capital;

    private String code2;
}
