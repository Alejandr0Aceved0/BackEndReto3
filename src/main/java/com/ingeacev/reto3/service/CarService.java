package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public List<CarModel> get() {
        return carRepository.findAll();
    }

    public List<CarModel> deleteAll() {
        carRepository.deleteAll();
        return carRepository.findAll();
    }

    /*public List<CarModel> getCarsByBrand(String brand) {

        return carRepository.findByBrand(brand, pageable);
    }*/

    public List<CarModel> getCarsByBrandAndYear(String brand, int year) {
        return carRepository.findByBrandAndYear(brand, year);
    }

    public List<CarModel> getCarsByBrandDesc(String brand) {
        return carRepository.findByBrandOrderByYearDesc(brand);
    }

    public List<CarModel> getCarsByBrandContent(String brand) {
        return carRepository.findByBrandContains(brand);
    }

    public List<CarModel> getCarsByBrandStartsContent(String brand) {
        return carRepository.findByBrandStartsWith(brand);
    }

    public List<CarModel> getCarsByBrandEndsContent(String brand) {
        return carRepository.findByBrandEndsWith(brand);
    }

    public Page<CarModel> getAllCarsByPages(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return carRepository.findAll(pageable);
    }

    public Page<CarModel> getCarsByBrandByPages(String brand, int page, int size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "year"));
        return carRepository.findByBrand(brand, pageable);
    }

    public List<CarModel> getCarsByBrandAsc(String brand) {
        return carRepository.findByBrandOrderByYearAsc(brand);
    }

    public void create(CarModel car) {
        carRepository.save(car);
        System.out.println("CARRO CREADO");
    }

    public List<CarModel> deleteCarById(int id) {
        carRepository.deleteById(id);
        System.out.println("CARRO ELIMINADO");
        return carRepository.findAll();
    }

    public void update(CarModel carPut) {

        Optional<CarModel> carDb = carRepository.findById(carPut.getIdCar());

        CarModel car = carDb.get();

        if (carDb.isPresent()){

            if (carPut.getBrand() != null){
                car.setBrand(carPut.getBrand());
            }

            if (carPut.getName() != null){
                car.setName(carPut.getName());
            }

            if (carPut.getDescription() != null){
                car.setDescription(carPut.getDescription());
            }

            if (carPut.getYear() != 0){
                car.setYear(carPut.getYear());
            }

            if (carPut.getMessages() != null){
                car.setMessages(carPut.getMessages());
            }

            if (carPut.getGama() != null){
                car.setGama(carPut.getGama());
            }

            if (carPut.getReservations() != null){
                car.setReservations(carPut.getReservations());
            }
        }
        carRepository.save(car);
    }
}
