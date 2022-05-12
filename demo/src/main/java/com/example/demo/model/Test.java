package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "test")
public class Test {
    @Id
    private String id;
    private String test;
    private String cao;
}
