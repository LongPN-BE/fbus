package com.example.fbus.service;

import com.example.fbus.enity.Schedule;
import com.example.fbus.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleService {

    @Autowired
    ScheduleRepository scheduleRepository;

    public List<Schedule> schedules() {
        List<Schedule> list = scheduleRepository.findAll();
        return list;
    }
}
