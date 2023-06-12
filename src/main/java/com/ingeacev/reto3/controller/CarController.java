package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarModel> get() {
        return carService.get();
    }

    @DeleteMapping("/all")
    public List<CarModel> deleteAll() {
        return carService.deleteAll();
    }

    /*@GetMapping("/all/By-Brand/{brand}")
    public List<CarModel> getCarByBrand(@PathVariable String brand) {
        return carService.getCarsByBrand(brand);
    }*/

    @GetMapping("/all/By-Brand-And-Year")
    public List<CarModel> getCarsByBrandAndYear(@RequestParam String brand, @RequestParam int year) {
        return carService.getCarsByBrandAndYear(brand, year);
    }

    @GetMapping("/all/By-Brand-Desc/{brand}")
    public List<CarModel> getCarByBrandDesc(@PathVariable String brand) {
        return carService.getCarsByBrandDesc(brand);
    }

    @GetMapping("/all/By-Brand-Asc/{brand}")
    public List<CarModel> getCarByBrandAsc(@PathVariable String brand) {

        return carService.getCarsByBrandAsc(brand);
    }

    @GetMapping("/all/Contains")
    public List<CarModel> getCarsByContent(@RequestParam String brand) {

        return carService.getCarsByBrandContent(brand);
    }

    @GetMapping("/all/Starts-Contains")
    public List<CarModel> getCarsByBrandStartContent(@RequestParam String brand) {

        return carService.getCarsByBrandStartsContent(brand);
    }

    @GetMapping("/all/Ends-Contains")
    public List<CarModel> getCarsByBrandEndsContent(@RequestParam String brand) {

        return carService.getCarsByBrandEndsContent(brand);
    }

    @GetMapping("/all/By-Pages")
    public Page<CarModel> getAllCarsByPages(@RequestParam int page, @RequestParam int size) {

        return carService.getAllCarsByPages(page, size);
    }

    @GetMapping("/all/By-Brand/Pages")
    public Page<CarModel> getCarsByBrandByPages(@RequestParam String brand, @RequestParam int page, @RequestParam int size) {

        return carService.getCarsByBrandByPages(brand, page, size);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody CarModel car) {
        carService.create(car);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public List<CarModel> deleteCarById(@PathVariable int id){
       return carService.deleteCarById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody CarModel car){
        carService.update(car);
    }
}
