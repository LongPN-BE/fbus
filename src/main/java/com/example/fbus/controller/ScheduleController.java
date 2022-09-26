package com.example.fbus.controller;

import com.example.fbus.enity.Schedule;
import com.example.fbus.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/schedules")
public class ScheduleController {

    @Autowired
    ScheduleService scheduleService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Schedule> schedules() { return scheduleService.schedules();}
}
