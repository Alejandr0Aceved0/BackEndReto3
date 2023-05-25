package com.ingeacev.reto3.service;

import com.ingeacev.reto3.dbo.GamaDbo;
import com.ingeacev.reto3.model.GamaModel;
import com.ingeacev.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamaService {

    @Autowired
    GamaRepository gamaRepository;

    public List<GamaModel> getGamas() {
        return gamaRepository.findAll();
    }

    public String createGama(GamaModel gamaModel) {
        gamaRepository.save(gamaModel);
        System.out.println("ADMINISTRADOR CREADO");
        return "ADMINISTRADOR CREADO";
    }

}
