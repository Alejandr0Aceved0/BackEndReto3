package com.ingeacev.reto3.dbo;


import com.ingeacev.reto3.model.GamaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CarDbo {

    private int idCar;

    private String name;

    private String brand;

    private int year;

    private String description;

    private GamaModel gama;
}
