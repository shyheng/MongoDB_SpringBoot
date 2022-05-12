package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class XS {
    public XS(String tit, String msg, String index) {
        this.tit = tit;
        this.msg = msg;
        this.index = index;
    }

    public XS() {
    }

    private String tit;
    private String msg;
    private String index;
}
