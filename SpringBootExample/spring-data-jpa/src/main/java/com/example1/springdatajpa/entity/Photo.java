package com.example1.springdatajpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by lenovo on 2018/9/29.
 */
@Entity
@Data
public class Photo {
    @Id
    @GeneratedValue

    private Integer id;
    private String photolink;
    private String name;

    public Photo(String photolink, String name) {
        this.photolink = photolink;
        this.name = name;
    }

    public Photo(){

    }
}
