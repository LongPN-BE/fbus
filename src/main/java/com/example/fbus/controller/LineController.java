package com.example.fbus.controller;

import com.example.fbus.enity.Line;
import com.example.fbus.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lines")
public class LineController {

    @Autowired
    LineService lineService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Line> lines() { return lineService.lines();}
}
