package com.ingeacev.reto3.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReservationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_reservation")
    private int idReservation;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "devolution_date")
    private Date devolutionDate;

    private String status = "created";

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_id_car", nullable = false)
    @JsonIgnoreProperties({"reservations"})
    private CarModel car;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_id_client", nullable = false)
    @JsonIgnoreProperties({"messages", "reservations"})
    private ClientModel client;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_id_score", referencedColumnName = "id_score", unique = true)
    private ScoreModel score;
}
