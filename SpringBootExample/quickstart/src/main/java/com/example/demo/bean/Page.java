package com.example.demo.bean;

import lombok.Data;

/**
 * Created by lenovo on 2018/9/10.
 */
@Data
public class Page {
    private String front;

    public Page(String front) {
        this.front = front;
    }

    public Page(){

    }
}
