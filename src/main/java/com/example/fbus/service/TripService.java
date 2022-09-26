package com.example.fbus.service;

import com.example.fbus.enity.Trip;
import com.example.fbus.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripService {

    @Autowired
    TripRepository tripRepository;

    public List<Trip> trips() {
        List<Trip> list = tripRepository.findAll();
        return list;
    }
}
