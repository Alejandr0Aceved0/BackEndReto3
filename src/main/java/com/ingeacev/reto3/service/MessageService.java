package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.MessageModel;
import com.ingeacev.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public List<MessageModel> getMessages() {
        return messageRepository.findAll();
    }

    public String createMessage(MessageModel messageModel) {
        messageRepository.save(messageModel);
        System.out.println("ADMINISTRADOR CREADO");
        return "ADMINISTRADOR CREADO";
    }

}
