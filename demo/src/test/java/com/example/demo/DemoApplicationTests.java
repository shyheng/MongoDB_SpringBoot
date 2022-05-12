package com.example.demo;

import com.example.demo.model.L;
import com.example.demo.model.X;
import com.example.demo.model.XS;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void contextLoads() {
        X x = new X();
        x.setId("1");
        x.setImg("http");
        List<XS> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new XS("d"+i,"m","1"));
        }
        x.setXs(list);
        System.out.println(mongoTemplate.save(x));
    }

}
