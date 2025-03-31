package com.spring.api.payload.request.requestDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CountryLanguage {
    private String countryCode;

    private String language;

    private String isOfficial;

    private double percentage;
}
