package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.CarDbo;
import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

//    @Autowired
//    CarService carService;

    @GetMapping("/all")
    public List<CarModel> getCars(){
//        return carService.getCars();
        return null;
    }

    @PostMapping("/save")
    public String saveCar(@RequestBody CarDbo carDbo){
//        return carService.createCar(carDbo);
        return null;
    }
}
