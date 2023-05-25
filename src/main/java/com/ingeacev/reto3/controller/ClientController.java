package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.ClientDbo;
import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
public class ClientController {

//    @Autowired
//    ClientService clientService;

    @GetMapping("/all")
    public List<ClientModel> getClients(){
//        return clientService.getClients();
        return null;
    }

    @PostMapping("/save")
    public String saveClient(@RequestBody ClientDbo clientDbo){
//        return clientService.createClient(clientDbo);
        return null;
    }
}
