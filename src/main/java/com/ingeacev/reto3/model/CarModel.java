package com.ingeacev.reto3.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Car")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_car")
    private int idCar;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private String brand;


    @Column(name = "car_year", length = 4, nullable = false)
    private int year;

    @Column(length = 250)
    private String description;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_id_gama", nullable = false)
    @JsonIgnoreProperties("cars")
    private GamaModel gama;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "car")
    @JsonIgnoreProperties({"car","client"})
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE,mappedBy = "car")
    @JsonIgnoreProperties({"messages", "reservations"})
    private List<ReservationModel> reservations;


}
