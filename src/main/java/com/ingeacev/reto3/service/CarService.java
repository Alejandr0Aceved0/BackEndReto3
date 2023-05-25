package com.ingeacev.reto3.service;

import com.ingeacev.reto3.dbo.CarDbo;
import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> getCars() {
        return carRepository.findAll();
    }

    public String createCar(CarModel carModel) {
        carRepository.save(carModel);
        System.out.println("CARRO CREADO");
        return "CARRO CREADO";
    }

}
