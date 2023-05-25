package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.GamaDbo;
import com.ingeacev.reto3.model.GamaModel;
import com.ingeacev.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

//    @Autowired
//    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> getGamas(){
//        return gamaService.getGamas();
        return null;
    }

    @PostMapping("/save")
    public String saveAdmin(@RequestBody GamaDbo gamaDbo){
//        return gamaService.createGama(gamaDbo);
        return null;
    }
}
