package com.spring.services.servicesInterfaces;

import com.spring.model.Client;

import java.util.List;

public interface ClientServicesInterface {

    public List<Client> getAllClients();

    public Client getClient(int id);


}
