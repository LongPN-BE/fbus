package com.example.fbus.service;

import com.example.fbus.enity.City;
import com.example.fbus.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    public CityRepository cityRepository;


    public List<City> citys(){
    List<City> city = cityRepository.findAll();
    return city;
    }
}
