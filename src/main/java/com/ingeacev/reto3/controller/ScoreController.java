package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.ScoreModel;
import com.ingeacev.reto3.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @GetMapping("/all")
    public List<ScoreModel> get(){
        return scoreService.get();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody ScoreModel score){
        scoreService.create(score);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        scoreService.deleteScoreById(id);
    }
}
