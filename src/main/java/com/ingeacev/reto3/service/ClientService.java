package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public List<ClientModel> get() {
        return clientRepository.findAll();
    }

    public List<ClientModel> deleteAll() {
        clientRepository.deleteAll();
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

    public void update(ClientModel clientPut) {
        Optional<ClientModel> clientModelDb = clientRepository.findById(clientPut.getIdClient());

        ClientModel client = clientModelDb.get();

        if (clientModelDb.isPresent()){

            if (clientPut.getEmail() != null){
                client.setEmail(clientPut.getEmail());
            }

            if (clientPut.getPassword() != null){
                client.setPassword(clientPut.getPassword());
            }

            if (clientPut.getName() != null){
                client.setName(clientPut.getName());
            }

            if (clientPut.getAge() != 0){
                client.setAge(clientPut.getAge());
            }

            if (clientPut.getMessages() != null){
                client.setMessages(clientPut.getMessages());
            }

            if (clientPut.getReservations() != null){
                client.setReservations(clientPut.getReservations());
            }
        }
        clientRepository.save(client);
    }


}
