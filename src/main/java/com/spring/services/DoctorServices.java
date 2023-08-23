package com.spring.services;

import com.spring.model.Doctor;
import com.spring.repositorys.DoctorRepository;
import com.spring.services.servicesInterfaces.DoctorServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServices implements DoctorServicesInterface {

    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int id) {
        return doctorRepository.getById(id);
    }
}
