package com.seekheart.springdemo.repositories;

import com.seekheart.springdemo.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {
    List<Message> findById(Long id);
    List<Message> findAll();
}
