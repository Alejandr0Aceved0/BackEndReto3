package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.ScoreModel;
import com.ingeacev.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> get() {
        return scoreRepository.findAll();
    }

    public void create(ScoreModel score) {
        scoreRepository.save(score);
        System.out.println("SCORE CREADO");
    }

    public void deleteScoreById(int id) {
        scoreRepository.deleteById(id);
        System.out.println("SCORE ELIMINADO");
    }

    public void update(ScoreModel scorePut) {

        Optional<ScoreModel> reservationBd = scoreRepository.findById(scorePut.getIdScore());

        ScoreModel reservation = reservationBd.get();

        if (reservationBd.isPresent()){

            if (scorePut.getStars() != 0){
                reservation.setStars(scorePut.getStars());
            }
        }
        scoreRepository.save(reservation);
    }
}
