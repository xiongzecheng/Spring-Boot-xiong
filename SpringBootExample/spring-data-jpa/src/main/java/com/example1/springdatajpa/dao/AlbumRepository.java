package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by lenovo on 2018/9/29.
 */
public interface AlbumRepository extends JpaRepository<Album, Integer> {

    /**
     * 自定义查询，得到按照相册喜欢数降序排练
     * @return
     */
    @Query("FROM Album album ORDER BY album.likes DESC")
    List<Album> findHotAlbums();

}
