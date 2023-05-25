package com.ingeacev.reto3.dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ClientDbo {

    private int idClient;

    private String email;

    private String password;

    private byte age;

    private String name;
}
