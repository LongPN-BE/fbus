package com.example.fbus.service;

import com.example.fbus.enity.Location;
import com.example.fbus.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {

    @Autowired
    LocationRepository locationRepository;

    public List<Location> locations() {
        List<Location> list = locationRepository.findAll();
        return list;
    }
}
