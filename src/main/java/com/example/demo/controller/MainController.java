package com.example.demo.controller;

import com.example.demo.repository.DoctorRepository;
import com.example.demo.repository.StomotologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MainController {

    @Autowired
    private StomotologyRepository stomotologyRepository;
    @Autowired
    private DoctorRepository doctorRepository;


}
