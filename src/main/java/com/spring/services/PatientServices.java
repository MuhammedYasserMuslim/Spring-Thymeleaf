package com.spring.services;

import com.spring.model.Patient;
import com.spring.repositorys.PatientRepository;
import com.spring.services.servicesInterfaces.PatientServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServices implements PatientServicesInterface {

    @Autowired
    PatientRepository patientRepository;
    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(int id) {
        return patientRepository.getById(id);
    }
}
