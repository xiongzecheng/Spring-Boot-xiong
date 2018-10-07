package com.example1.springdatajpa.dao;

import com.example1.springdatajpa.entity.Album;
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
public class AlbumRepositoryTest {

    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void initData(){
        Album[] albums={
                new Album("https://goo.gl/8c1kzz","旅行 在路上","邂逅一个国家，讲述一座城市，这里有你期待的诗与远方。 ",2493892),
                new Album("https://goo.gl/xprKt8","故事","故事专题，不论是旅行生活中亲身经历的真实故事，还是童话玄幻遐想的虚构故事，这里记录你的每个故事。 ",1263347),
                new Album("https://goo.gl/k2AzWM","简书电影","本专题收录电影相关文章。要求文内不得带有公众号信息等推广内容。 ",1815096),
                new Album("https://goo.gl/bYQwPy","摄影","每个人都是独特的艺术家 \n" +
                        "用快门捕捉你双眼所见，心有所感的一切  ",1902832),
                new Album("https://goo.gl/YYzh4Y","生活家","所有让生活变得更好的技能和经验，（比如教你p照片，记录瘦身过程等）纯粹生活感悟不收  ",1567253),
                new Album("https://goo.gl/mHLWcy","程序员","如果你是程序员，或者有一颗喜欢写程序的心，喜欢分享技术干货、项目经验、程序员日常囧事等等，欢迎投稿《程序员》专题。 ",962786)
        };
        for (int i=0;i<6;i++){
            albumRepository.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums(){
        List<Album> albumList=albumRepository.findHotAlbums();
        System.out.println(albumList);
    }
}