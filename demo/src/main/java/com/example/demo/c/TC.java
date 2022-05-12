package com.example.demo.c;

import com.example.demo.model.L;
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
    public List<L> get(){
        return mongoTemplate.findAll(L.class);
    }

    @GetMapping("/i")
    public Object in(){
        L l = new L();
        l.setName("shy");
        l.setPass("123");
        return mongoTemplate.insert(l);
    }

    @GetMapping("/up")
    public Object up(){
        L l = new L();
        l.setId("1");
        l.setName("shy1");
        l.setPass("123");
        return mongoTemplate.save(l);
    }
}
