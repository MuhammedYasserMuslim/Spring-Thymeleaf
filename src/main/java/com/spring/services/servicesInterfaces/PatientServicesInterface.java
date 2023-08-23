package com.spring.services.servicesInterfaces;

import com.spring.model.Patient;

import java.util.List;

public interface PatientServicesInterface {

    public List<Patient> getAllPatient();
    public Patient getPatientById(int id);
}
