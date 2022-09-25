package com.example.fbus.service;


import com.example.fbus.enity.Area;
import com.example.fbus.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {

    @Autowired
    AreaRepository areaRepository;

    public List<Area> areas(){
        List<Area> list = areaRepository.findAll();
        if (list.isEmpty()){
            System.out.println("This is null");
        }
        return list;
    }

}
