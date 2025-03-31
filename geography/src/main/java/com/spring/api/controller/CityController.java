package com.spring.api.controller;

import com.spring.api.model.City;
import com.spring.api.payload.request.UpdateRequest;
import com.spring.api.payload.response.ResponseData;
import com.spring.api.service.serviceImp.CityServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/city")
public class CityController {

    @Autowired
    CityServiceImp service;


    @GetMapping("/getCity")
    public Optional<City> getCityById(@RequestParam(name = "Id") int Id ){
        return service.getCityById(Id);
    }

    @GetMapping("/getAllCity")
    public ResponseData<City> getAllCity(@RequestParam(name = "listId") List<Integer> listId,
                                         @RequestParam(name = "requestId") String requestId,
                                         @RequestParam(name = "sessionId") String sessionId
    ){
        try {
            System.out.println(listId.toString());
            List<City> rs = service.getAllCity(listId);
            return new ResponseData<>(requestId, sessionId,200, null, rs);}
        catch (Exception e){
            return new ResponseData<>(requestId, sessionId, 404, e.getMessage(), null);
        }
    }

    @PostMapping("/addCities")
    public ResponseData<City> saveAllCity(@RequestBody UpdateRequest<City> request){
        try {
            service.saveCity(new ArrayList<>(request.getData()));
            return new ResponseData<>(request.getRequestId(), request.getSessionId(), 200, "Success", null);
        } catch (Exception e) {
            return new ResponseData<>(request.getRequestId(), request.getSessionId(), 404, e.getMessage(), null);
        }
    }

    @DeleteMapping("/deleteCity")
    public ResponseData<City> deleteCity(//@PathVariable int id //,
//                                         @RequestParam(name = "requestId") String requestId,
//                                         @RequestParam(name = "sessionId") String sessionId
    ){
        try {
            service.deleteCity(1);
            return new ResponseData<>("requestId", "sessionId", 200, "Success", null);
        } catch (Exception e) {
            return new ResponseData<>("requestId", "sessionId", 404, e.getMessage(), null);
        }
    }

}
