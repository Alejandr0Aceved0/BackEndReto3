package com.ingeacev.reto3.dbo;


import com.ingeacev.reto3.model.ClientModel;
import com.ingeacev.reto3.model.GamaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MessageDbo {

    private int idMessage;

    private String messageText;

    private GamaModel car;

    private ClientModel client;
}
