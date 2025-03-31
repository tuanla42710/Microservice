package com.spring.api.service;

import com.spring.api.model.Country;

import java.util.List;

public interface CountryService {

    List<Country> getCountryByListId(List<String> listCode);

    void saveNewCountry(List<Country> listCountry);

    void deleteCountryById(String code);
}
