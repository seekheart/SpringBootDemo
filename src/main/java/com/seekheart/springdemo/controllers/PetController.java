package com.seekheart.springdemo.controllers;

import com.seekheart.springdemo.models.Pet;
import com.seekheart.springdemo.repositories.PetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pets")
public class PetController {
  @Autowired
  private PetRepository repository;

  @RequestMapping(method = RequestMethod.GET)
  public List<Pet> findAll() {
    return repository.findAll();
  }
}
