package com.ingeacev.reto3.controller;

import com.ingeacev.reto3.model.MessageModel;
import com.ingeacev.reto3.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/all")
    public List<MessageModel> get(){
        return messageService.get();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody MessageModel message){
        messageService.create(message);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id){
        messageService.deleteMessageById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody MessageModel message){
        messageService.update(message);
    }
}
