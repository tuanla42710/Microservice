package com.spring.api.service.serviceImp;


import com.spring.api.model.Country;
import com.spring.api.repository.CountryRepository;
import com.spring.api.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class CountryServiceImp implements CountryService {

    @Autowired
    CountryRepository repository;


    @Override
    public List<Country> getCountryByListId(List<String> listCode) {
        return repository.findAllById(listCode);
    }

    @Override
    public void saveNewCountry(List<Country> listCountry) {
        repository.saveAll(listCountry);
    }

    @Override
    public void deleteCountryById(String code) {
        repository.deleteById(code);
    }


}
