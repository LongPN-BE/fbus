package com.example.fbus.service;

import com.example.fbus.enity.BusStop;
import com.example.fbus.repository.BusStopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusStopService {

    @Autowired
    BusStopRepository busStopRepository;

    public List<BusStop> busStops() {
        List<BusStop> list = busStopRepository.findAll();
        return list;
    }
}
