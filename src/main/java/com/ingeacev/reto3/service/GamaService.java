package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.GamaModel;
import com.ingeacev.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> get() {
        return gamaRepository.findAll();
    }

    public void create(GamaModel gama) {
        gamaRepository.save(gama);
    }

    public void deleteById(int id) {
        gamaRepository.deleteById(id);
        System.out.println("GAMA ELIMINADA");
    }
}
