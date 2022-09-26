package com.example.fbus.service;

import com.example.fbus.enity.Driver;
import com.example.fbus.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public List<Driver> drivers() {
        List<Driver> list = driverRepository.findAll();
        if (list.isEmpty()){
            System.out.println("This is null");
        }
        return list;
    }
}
