package com.spring.services;

import com.spring.model.Client;
import com.spring.repositorys.ClientRepository;
import com.spring.services.servicesInterfaces.ClientServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServices implements ClientServicesInterface {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClient(int id) {
        return clientRepository.getById(id);
    }
}
