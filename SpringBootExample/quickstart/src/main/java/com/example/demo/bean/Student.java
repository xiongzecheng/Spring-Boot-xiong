package com.example.demo.bean;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lenovo on 2018/9/3.
 */
//@Configuration
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode
@Configuration
@Data
public class Student {
//    @Value("张三")
//    private String name;
//
//    @Value("#{23-2}")
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
    private String back;
    private String name;
    private String age;
    private String male;
    private String cardId;
    private String studentNo;
    private String  nativePlace;
    private String contact;
    private String dormitoryNo;
    private String highSchool;

}
