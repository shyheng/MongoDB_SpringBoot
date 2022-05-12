package com.example.demo.model;

import com.example.demo.c.TC;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "test")
public class L {
    @Id
    private Object id;
    private String name;
    private String pass;
}
