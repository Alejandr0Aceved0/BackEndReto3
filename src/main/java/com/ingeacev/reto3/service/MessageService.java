package com.ingeacev.reto3.service;

import com.ingeacev.reto3.model.MessageModel;
import com.ingeacev.reto3.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void deleteMessageById(int id) {
        messageRepository.deleteById(id);
        System.out.println("MESSAGE ELIMINADO");
    }

    public void update(MessageModel messagePut) {

        Optional<MessageModel> messageBd = messageRepository.findById(messagePut.getIdMessage());

        MessageModel gama = messageBd.get();

        if (messageBd.isPresent()){

            if (messagePut.getMessageText() != null){
                gama.setMessageText(messagePut.getMessageText());
            }

            if (messagePut.getCar() != null){
                gama.setCar(messagePut.getCar());
            }

            if (messagePut.getClient() != null){
                gama.setClient(messagePut.getClient());
            }
        }
        messageRepository.save(gama);
    }
}
