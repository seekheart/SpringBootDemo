package com.seekheart.springdemo.controllers;

import com.seekheart.springdemo.models.Message;
import com.seekheart.springdemo.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/")
public class HomeController {
    @Autowired
    protected MessageRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Message> getMessages() {
        return repository.findAll();
    }
}
