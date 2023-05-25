package com.ingeacev.reto3.service;

import com.ingeacev.reto3.dbo.ScoreDbo;
import com.ingeacev.reto3.model.ScoreModel;
import com.ingeacev.reto3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    ScoreRepository scoreRepository;

    public List<ScoreModel> getScores() {
        return scoreRepository.findAll();
    }

    public String createScore(ScoreModel scoreModel) {
        scoreRepository.save(scoreModel);
        System.out.println("SCORE CREADO");
        return "SCORE CREADO";
    }

}
