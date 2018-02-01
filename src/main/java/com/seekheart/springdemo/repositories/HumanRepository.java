package com.seekheart.springdemo.repositories;

import com.seekheart.springdemo.models.Human;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository<Human, Long> {
  List<Human> findAll();
  List<Human> findById(Long id);
}
