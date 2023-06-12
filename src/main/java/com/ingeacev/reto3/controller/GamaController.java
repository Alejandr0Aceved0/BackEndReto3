package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.GamaModel;
import com.ingeacev.reto3.service.GamaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Gama")
public class GamaController {

    @Autowired
    GamaService gamaService;

    @GetMapping("/all")
    public List<GamaModel> get(){
        return gamaService.get();
    }

    @DeleteMapping("/all")
    public List<GamaModel> deleteAll(){
        return gamaService.deleteAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody GamaModel gama){
        gamaService.create(gama);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<GamaModel> deleteGamaById(@PathVariable int id){
       return gamaService.deleteById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody GamaModel gama){
        gamaService.update(gama);
    }
}
