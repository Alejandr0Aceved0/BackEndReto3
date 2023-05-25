package com.ingeacev.reto3.dbo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class GamaDbo {

    private int idGama;

    private String name;

    private String description;
}
