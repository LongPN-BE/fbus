package com.example.fbus.service;

import com.example.fbus.enity.School;
import com.example.fbus.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    public SchoolRepository schoolRepository;

    public List<School> schools(){
        List<School> list = schoolRepository.findAll();
        if (list.isEmpty()){
            System.out.println("This is null");
        }
        return  list;
    }
}
