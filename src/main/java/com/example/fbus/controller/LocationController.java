package com.example.fbus.controller;

import com.example.fbus.enity.Driver;
import com.example.fbus.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/drivers")
public class LocationController {

    @Autowired
    DriverService driverService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Driver> drivers() { return driverService.drivers();}
}
