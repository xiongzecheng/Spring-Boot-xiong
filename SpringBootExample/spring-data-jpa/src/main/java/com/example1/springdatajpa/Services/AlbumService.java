package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.Album;

import java.util.List;

/**
 * Created by lenovo on 2018/9/29.
 */
public interface AlbumService {
    List<Album> getAlbums();
}
