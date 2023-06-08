package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> get() {
        return clientRepository.findAll();
    }

    public void create(ClientModel client) {
        clientRepository.save(client);
        System.out.println("CLIENTE CREADO");
    }

    public void deleteClientById(int id) {
        clientRepository.deleteById(id);
        System.out.println("CLIENTE ELIMINADO");
    }
}
