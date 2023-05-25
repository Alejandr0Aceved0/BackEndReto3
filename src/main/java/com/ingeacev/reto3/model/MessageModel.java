package com.ingeacev.reto3.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Message")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MessageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_message")
    private int idMessage;

    @Column(length = 250, name = "message_text")
    private String messageText;

    @ManyToOne
    @JoinColumn(name = "gama")
    private GamaModel car;

    @ManyToOne
    @JoinColumn(name = "client")
    private ClientModel client;
}