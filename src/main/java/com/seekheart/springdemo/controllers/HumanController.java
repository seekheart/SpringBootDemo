package com.seekheart.springdemo.controllers;

import com.seekheart.springdemo.models.Human;
import com.seekheart.springdemo.repositories.HumanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/humans")
public class HumanController {
  @Autowired
  private HumanRepository repository;

  @RequestMapping(method = RequestMethod.GET)
  public List<Human> findAll() {
    return repository.findAll();
  }
}
