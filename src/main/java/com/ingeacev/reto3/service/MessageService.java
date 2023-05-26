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

    public List<MessageModel> get() {
        return messageRepository.findAll();
    }

    public void create(MessageModel message) {
        messageRepository.save(message);
        System.out.println("MESSAGE CREADO");
    }

}
