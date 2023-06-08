package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.GamaModel;
import com.ingeacev.reto3.repository.GamaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void update(GamaModel gamaPut) {

        Optional<GamaModel> gamaBd = gamaRepository.findById(gamaPut.getIdGama());

        GamaModel gama = gamaBd.get();

        if (gamaBd.isPresent()){

            if (gamaPut.getName() != null){
                gama.setName(gamaPut.getName());
            }

            if (gamaPut.getDescription() != null){
                gama.setDescription(gamaPut.getDescription());
            }

            if (gamaPut.getCars() != null){
                gama.setCars(gamaPut.getCars());
            }
        }
        gamaRepository.save(gama);
    }
}
