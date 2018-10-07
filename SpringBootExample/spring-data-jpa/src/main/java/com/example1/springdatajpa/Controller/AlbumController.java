package com.example1.springdatajpa.Controller;

import com.example1.springdatajpa.Services.AlbumService;
import com.example1.springdatajpa.entity.Album;
import com.example1.springdatajpa.entity.Photo;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * Created by lenovo on 2018/9/29.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/album")
public class AlbumController {
    @Resource
    private AlbumService albumService;

    @GetMapping(value = "/all")
   public List<Album> getAlbums(){
        return  albumService.getAlbums();
    }

}
