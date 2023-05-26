package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> get() {
        return reservationRepository.findAll();
    }

    public void create(ReservationModel reservation) {
        reservationRepository.save(reservation);
        System.out.println("RESERVACION CREADO");
    }

}
