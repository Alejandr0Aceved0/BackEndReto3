package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> get() {
        return clientService.get();
    }

    @DeleteMapping("/all")
    public List<ClientModel> deleteAll() {
        return clientService.deleteAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ClientModel client) {
        clientService.create(client);
    }

    @DeleteMapping("/{id}")
    public List<ClientModel> deleteClientById(@PathVariable int id){
       return clientService.deleteClientById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ClientModel client){
        clientService.update(client);
    }
}
