package com.example.demo.c;

import com.example.demo.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TC {

    @Autowired
    private MongoTemplate mongoTemplate;


    @GetMapping("/s")
    public List<Test> get(){
        return mongoTemplate.findAll(Test.class);
    }
}
