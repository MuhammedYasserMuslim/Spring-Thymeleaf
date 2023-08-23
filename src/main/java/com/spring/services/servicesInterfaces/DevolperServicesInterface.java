package com.spring.services.servicesInterfaces;

import com.spring.model.Devolper;


import java.util.List;


public interface DevolperServicesInterface {

    public List<Devolper> getAllDevolpers();

    public Devolper getDevolperById(int id);

    public Devolper updateDevolper(Devolper devolper);

    public void deleteDevolper(int id);
}
