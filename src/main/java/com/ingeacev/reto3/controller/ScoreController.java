package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.ScoreDbo;
import com.ingeacev.reto3.model.ScoreModel;
import com.ingeacev.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

//    @Autowired
//    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> getScores(){
//        return scoreService.getScores();
        return null;
    }

    @PostMapping("/save")
    public String saveAdmin(@RequestBody ScoreDbo scoreDbo){
//        return scoreService.createScore(scoreDbo);
        return null;
    }
}
