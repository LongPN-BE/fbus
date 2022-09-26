package com.example.fbus.controller;

import com.example.fbus.enity.Bus;
import com.example.fbus.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/buss")
public class BusController {

    @Autowired
    BusService busService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Bus> bus() { return busService.buss();}
}
