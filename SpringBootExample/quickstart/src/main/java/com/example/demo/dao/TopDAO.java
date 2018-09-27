package com.example.demo.dao;


import com.example.demo.bean.Content;
import com.example.demo.bean.Page;
import com.example.demo.bean.Top;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lenovo on 2018/9/10.
 */
@Data
@Configuration
public class TopDAO {
    public Top getTop(){
        Top top = new Top();
        top.setName("少数派");
        top.setLogo("logo.ico");
        top.setMiddle("推荐应用");
        top.setPencil("pencil.png");
        top.setSearch("search.png");
        top.setMessage("message.png");
        top.setAvatar("avatar.PNG");
        return top ;
    }

    public List<Content> getContents(){
        Content[] contents={
        new Content("a1.jpg","少数派编辑部","2天前","一派|苹果秋季发布会你最期待什么新产品？","这一期的一派，少数派编辑们对下周的苹果秋季发布会谈了谈自己最期待的产品以及购置计划。同时我们也想听听大家的想法。","p1.jpg","20","30"),
        new Content("a2.jpg","少数派编辑部","2天前","工作日让家中电脑不再闲置，其实你可以遥控他做很多事","如果打个小算盘你就会发现家中电脑的利用率低到令人发指的地步，那么怎么才能在工作日的时候让家中的电脑也能被充分利用起来呢？","p2.jpg","20","30"),
        new Content("a3.jpg","少数派编辑部","2天前","5种方法，在电脑和手机里告别百度搜索里的广告","百度上各种广告对用户搜索体验造成的不良影响已不是什么新鲜事。在这篇文章中，我将向大家介绍一些在电脑和手机上减少百度推广广告出现的方法，还你干净快捷的搜索体验。","p3.jpg","20","30"),
        new Content("a4.jpg","少数派编辑部","2天前","Chorme在十周年发布了新版本，除了好看还更安全","Google 在 Chrome 十周年之际向全平台推送了 Chrome 69 正式版的更新，为我们带来了采用全新设计的 Google material theme 主题，同时还新增了许多新功能，特别在安全性方面做出了很大的提升。","p4.jpg","20","30"),
        new Content("a5.jpg","少数派编辑部","2天前","Mac上最好用的系统清理工具大更新，现在你还可以用它更新应用：CleanMyMac X","CleanMyMac X 率先在 Setapp 平台上推出，大版本更新不但带来了全新设计的应用界面，还新增了许多实用的工具，满足了 Mac 使用者清理系统的日常需求。","p5.jpg","20","30"),
        };
        List<Content> contentList = Arrays.asList(contents);
        return contentList;
    }

    public List<Page> getPages(){
        Page[] pages={
                new Page("s1.png"),
                new Page("s2.png"),
                new Page("s3.png"),
                new Page("s4.png"),
        };
        List<Page> pageList = Arrays.asList(pages);
        return pageList;
    }
}
