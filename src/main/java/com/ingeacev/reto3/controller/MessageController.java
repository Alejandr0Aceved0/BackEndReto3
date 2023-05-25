package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.dbo.MessageDbo;
import com.ingeacev.reto3.model.MessageModel;
import com.ingeacev.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

//    @Autowired
//    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> getMessages(){
//        return messageService.getMessages();
        return null;
    }

    @PostMapping("/save")
    public String saveMessage(@RequestBody MessageDbo messageDbo){
//        return messageService.createMessage(messageDbo);
        return null;
    }
}
