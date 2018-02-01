package com.seekheart.springdemo.repositories;

import com.seekheart.springdemo.models.Pet;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
  List<Pet> findAll();
  List<Pet> findById(Long id);
}
