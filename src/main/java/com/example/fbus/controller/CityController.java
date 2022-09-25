package com.example.fbus.controller;


import com.example.fbus.enity.City;
import com.example.fbus.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/citys")
public class CityController {

    @Autowired
    CityService cityService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<City> citys(){
        return cityService.citys();
    }
}
