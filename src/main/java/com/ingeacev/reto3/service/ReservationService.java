package com.ingeacev.reto3.service;

import com.ingeacev.reto3.dbo.ReservationDbo;
import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    public List<ReservationModel> getReservations() {
        return reservationRepository.findAll();
    }

    public String createReservation(ReservationModel reservationModel) {
        reservationRepository.save(reservationModel);
        System.out.println("ADMINISTRADOR CREADO");
        return "ADMINISTRADOR CREADO";
    }

}
