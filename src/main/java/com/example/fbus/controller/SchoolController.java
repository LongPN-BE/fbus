package com.example.fbus.controller;

import com.example.fbus.enity.School;
import com.example.fbus.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/schools")
public class SchoolController {

    @Autowired
    SchoolService schoolService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<School> schools() { return schoolService.schools();}


}
