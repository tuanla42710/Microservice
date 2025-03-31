package com.spring.api.service.serviceImp;

import com.spring.api.model.City;
import com.spring.api.repository.CityRepository;
import com.spring.api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImp implements CityService {

    @Autowired
    CityRepository repository;

    @Override
    public Optional<City> getCityById(int id) {

        return repository.findById(id);
    }

    @Override
    public List<City> getAllCity(List<Integer> listId) {
        return repository.findAllById(listId);
    }

    @Override
    public void saveCity(ArrayList<City> cities) {
        repository.saveAll(cities);
    }


    @Override
    public void updateCity() {

    }

    @Override
    public void deleteCity(int id) {
        repository.deleteById(id);
    }
}
