package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.ReservationDbo;
import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {

//    @Autowired
//    ReservationService reservationService;

    @GetMapping("/all")
    public List<ReservationModel> getReservations(){
//        return reservationService.getReservations();
        return null;
    }

    @PostMapping("/save")
    public String saveReservation(@RequestBody ReservationDbo reservationDbo){
//        return reservationService.createReservation(reservationDbo);
        return null;
    }
}
