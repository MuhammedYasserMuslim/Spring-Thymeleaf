package com.spring.controller;

import com.spring.model.Patient;
import com.spring.services.PatientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientServices patientServices;

    //http://localhost:8080/patient/name
    @GetMapping("/name")
    public List<Patient> getName(){
        return patientServices.getAllPatient();
    }
}
