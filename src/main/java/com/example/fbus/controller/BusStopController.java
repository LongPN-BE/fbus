package com.example.fbus.controller;

import com.example.fbus.enity.BusStop;
import com.example.fbus.service.BusStopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/busstops")
public class BusStopController {

    @Autowired
    BusStopService busStopService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<BusStop> busStops() { return busStopService.busStops();}
}
