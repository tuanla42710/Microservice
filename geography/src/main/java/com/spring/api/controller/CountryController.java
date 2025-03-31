package com.spring.api.controller;

import com.spring.api.model.Country;
import com.spring.api.payload.request.UpdateRequest;
import com.spring.api.payload.response.ResponseData;
import com.spring.api.service.serviceImp.CityServiceImp;
import com.spring.api.service.serviceImp.CountryServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api/country")
public class CountryController {

    @Autowired
    CountryServiceImp service;

    @GetMapping("/getCityByListId")
    ResponseData<Country> getCountryByListId(@RequestParam(name = "listId") List<String> listId,
                                             @RequestParam(name = "requestId") String requestId,
                                             @RequestParam(name = "sessionId") String sessionId){
        try {
            List<Country> rs = service.getCountryByListId(listId);
            return new ResponseData<>(requestId, sessionId, 200, null, rs);
        } catch (Exception e) {
            return new ResponseData<>(requestId, sessionId, 404, e.getMessage(), null);
        }
    }

    @PostMapping("/saveNewCountry")
    ResponseData<Country> saveNewCountry(@RequestBody UpdateRequest<Country> request){
        try {
            service.saveNewCountry(request.getData());
            return new ResponseData<>(request.getRequestId(), request.getSessionId(), 200, null,null);
        } catch (Exception e) {
            return new ResponseData<>(request.getRequestId(), request.getSessionId(),404, e.getMessage(), null);
        }
    }

//    @DeleteMapping("/deleteCountryById")
//    ResponseData<Country> deleteCountryById(@RequestParam(name = "Id") String id,
//                                            @RequestParam(name = "requestId") String requestId,
//                                            @RequestParam(name = "sessionId") String sessionId){
//        try {
//            service.deleteCountryById(id);
//            return new ResponseData<>(requestId, sessionId, 200, null, null);
//        } catch (Exception e) {
//            return new ResponseData<>(requestId, sessionId, 404, e.getMessage(), null);
//        }
//    }
}
