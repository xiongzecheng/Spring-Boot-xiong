package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lenovo on 2018/9/29.
 */
public interface PhotoRepository extends JpaRepository<Photo,Integer> {
    @Query("FROM Photo photo ORDER BY photo.id DESC")
    List<Photo> findNewPhoto();
}
