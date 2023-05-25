package com.ingeacev.reto3.repository;

import com.ingeacev.reto3.model.ReservationModel;
import com.ingeacev.reto3.model.ScoreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<ScoreModel,Integer> {
}
