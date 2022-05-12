package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "test")
public class X {

    @Id
    private Object id;
    private String img;
    private List<XS> xs;
}


