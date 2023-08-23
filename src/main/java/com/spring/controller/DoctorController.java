package com.spring.controller;

import com.spring.model.Doctor;
import com.spring.services.DoctorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    DoctorServices doctorServices;

    @GetMapping("/name")
    public List<Doctor> getDoctors(){
        return doctorServices.getAllDoctors();
    }
}
