package com.example.fbus.service;

import com.example.fbus.enity.Bus;
import com.example.fbus.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    BusRepository busRepository;

    public List<Bus> buss() {
        List<Bus> list = busRepository.findAll();
        return list;
    }
}
