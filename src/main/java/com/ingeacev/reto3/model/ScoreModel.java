package com.ingeacev.reto3.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Score")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ScoreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_score")
    private int idScore;

    private float value;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id_reservation", nullable = false, unique = true)
    private ReservationModel reservation;
}
