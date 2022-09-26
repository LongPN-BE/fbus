package com.example.fbus.controller;

import com.example.fbus.enity.Location;
import com.example.fbus.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/locations")
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Location> locations() { return locationService.locations();}
}
