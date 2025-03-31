package com.spring.api.service;


import com.spring.api.model.City;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface CityService {

    public Optional<City> getCityById(int id);

    public List<City> getAllCity(List<Integer> listId);

    public void saveCity(ArrayList<City> cities);

    public void updateCity();

    public void deleteCity(int Id);


}
