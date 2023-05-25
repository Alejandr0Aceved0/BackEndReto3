package com.ingeacev.reto3.service;

import com.ingeacev.reto3.dbo.ClientDbo;
import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> getClients() {
        return clientRepository.findAll();
    }

    public String createClient(ClientModel clientModel) {
        clientRepository.save(clientModel);
        System.out.println("CLIENTE CREADO");
        return "CLIENTE CREADO";
    }

}
