package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteReservationById(int id) {
        reservationRepository.deleteById(id);
        System.out.println("RESERVACION ELIMINADO");
    }

    public void update(ReservationModel reservationPut) {

        Optional<ReservationModel> reservationBd = reservationRepository.findById(reservationPut.getIdReservation());

        ReservationModel reservation = reservationBd.get();

        if (reservationBd.isPresent()){

            if (reservationPut.getStartDate() != null){
                reservation.setStartDate(reservationPut.getStartDate());
            }

            if (reservationPut.getDevolutionDate() != null){
                reservation.setDevolutionDate(reservationPut.getDevolutionDate());
            }

            if (reservationPut.getStatus() != null){
                reservation.setStatus(reservationPut.getStatus());
            }

            if (reservationPut.getCar() != null){
                reservation.setCar(reservationPut.getCar());
            }

            if (reservationPut.getClient() != null){
                reservation.setClient(reservationPut.getClient());
            }

            if (reservationPut.getScore() != null){
                reservation.setScore(reservationPut.getScore());
            }
        }
        reservationRepository.save(reservation);
    }
}
