package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Photo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PhotoRepositoryTest {

    @Resource
    private PhotoRepository photoRepository;

    @Test
    public void initData(){
        Photo[] photos={
                new Photo("https://goo.gl/8FhB9W","风景一"),
                new Photo("https://goo.gl/WejqLA","风景二"),
                new Photo("https://goo.gl/RK16hv","风景三"),
                new Photo("https://goo.gl/QDavgh","风景四"),

        };
        for(int i=0;i<4;i++){
            photoRepository.save(photos[i]);
        }
    }
    @Test
    public void findNewPhoto() throws Exception {
        List<Photo> photoList=photoRepository.findNewPhoto();
        System.out.println(photoList);
    }

}