package com.ingeacev.reto3.model;


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

    @ManyToOne
    @JoinColumn(name = "client")
    private ClientModel client;

    @ManyToOne
    @JoinColumn(name = "car")
    private CarModel car;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "devolution_date")
    private Date devolutionDate;
}
