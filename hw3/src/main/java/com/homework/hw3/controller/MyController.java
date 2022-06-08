package com.homework.hw3.controller;

import com.homework.hw3.entity.MyEntity;
import com.homework.hw3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/1")
    public List<MyEntity> getStr() {
        return myService.getValueFromTable();
    }

    @GetMapping("/2")
    public String getStr2() {
        myService.saveEntity();
        return "OK";
    }
}
