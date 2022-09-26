package com.example.fbus.service;

import com.example.fbus.enity.Line;
import com.example.fbus.repository.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {

    @Autowired
    LineRepository lineRepository;

    public List<Line> lines() {
        List<Line> list = lineRepository.findAll();
        return list;
    }
}
