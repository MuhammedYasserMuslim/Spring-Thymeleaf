package com.spring.services.servicesInterfaces;

import com.spring.model.Doctor;

import java.util.List;

public interface DoctorServicesInterface {

    public List<Doctor> getAllDoctors();
    public Doctor getDoctorById(int id);
}
