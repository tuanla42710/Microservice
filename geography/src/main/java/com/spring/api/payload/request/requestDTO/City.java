package com.spring.api.payload.request.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class City {

    private int Id;


    private String name;


    private String countryCode;


    private String district;


    private int population;
}
