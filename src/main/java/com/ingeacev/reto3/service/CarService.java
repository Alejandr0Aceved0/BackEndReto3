package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> get() {
        return carRepository.findAll();
    }

    public List<CarModel> getCarsByBrand(String brand) {
        return carRepository.findByBrand(brand);
    }

    public List<CarModel> getCarsByBrandAndYear(String brand, int year) {
        return carRepository.findByBrandAndYear(brand, year);
    }

    public List<CarModel> getCarsByBrandDesc(String brand) {
        return carRepository.findByBrandOrderByYearDesc(brand);
    }

    public List<CarModel> getCarsByBrandAsc(String brand) {
        return carRepository.findByBrandOrderByYearAsc(brand);
    }
    public void create(CarModel car) {
        carRepository.save(car);
        System.out.println("CARRO CREADO");
    }
}
