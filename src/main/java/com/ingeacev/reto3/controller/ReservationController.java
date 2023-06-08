package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> get(){
        return reservationService.get();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ReservationModel reservation){
        reservationService.create(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        reservationService.deleteReservationById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody ReservationModel reservationModel){
        reservationService.update(reservationModel);
    }
}
