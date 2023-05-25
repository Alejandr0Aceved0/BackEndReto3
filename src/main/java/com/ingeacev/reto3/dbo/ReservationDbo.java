package com.ingeacev.reto3.dbo;


import com.ingeacev.reto3.model.CarModel;
import com.ingeacev.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReservationDbo {

    private int idReservation;

    private ClientModel client;

    private CarModel car;

    private Date startDate;

    private Date devolutionDate;
}
