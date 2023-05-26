package com.ingeacev.reto3.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Client")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;

    @Column(length = 45)
    private String email;

    @Column(length = 45)
    private String password;

    @Column(length = 250)
    private String name;

    @Column(length = 3)
    private int age;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<MessageModel> messages;

    @OneToMany(cascade = CascadeType.MERGE)
    private List<ReservationModel> reservations;
}
