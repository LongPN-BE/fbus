package com.example.fbus.controller;

import com.example.fbus.enity.Trip;
import com.example.fbus.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/trips")
public class TripController {

    @Autowired
    TripService tripService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Trip> trips() { return tripService.trips();}
}
