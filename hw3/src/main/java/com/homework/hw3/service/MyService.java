package com.homework.hw3.service;

import com.homework.hw3.entity.MyEntity;
import com.homework.hw3.repo.MyRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    MyRepository myRepository;
    public List<MyEntity> getValueFromTable() {
        return myRepository.findByName("Evgeny");
    }

    public void saveEntity() {
        var entity = new MyEntity();
        entity.setId(1L);
        entity.setName("Evgeny");

        myRepository.save(entity);
    }
}
