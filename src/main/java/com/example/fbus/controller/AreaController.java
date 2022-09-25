package com.example.fbus.controller;


import com.example.fbus.enity.Area;
import com.example.fbus.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/areas")
public class AreaController {

    @Autowired
    AreaService areaService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Area> areas(){
        return areaService.areas();
    }


}
