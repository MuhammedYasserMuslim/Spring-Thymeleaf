package com.spring.services;

import com.spring.model.Devolper;
import com.spring.repositorys.DevolperRepository;
import com.spring.services.servicesInterfaces.DevolperServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevolperServices implements DevolperServicesInterface {

    @Autowired
    private DevolperRepository devolperRepository;


    @Override
    public List<Devolper> getAllDevolpers() {
        return devolperRepository.findAll();
    }

    @Override
    public Devolper getDevolperById(int id) {
        return devolperRepository.getById(id);
    }

    @Override
    public Devolper updateDevolper(Devolper devolper) {
        return devolperRepository.save(devolper);
    }

    @Override
    public void deleteDevolper(int id) {

    }
}
