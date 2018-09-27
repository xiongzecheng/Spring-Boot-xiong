package com.example.demo.bean;

import lombok.Data;

/**
 * Created by lenovo on 2018/9/10.
 */
@Data
public class Content {
    private String avatar;
    private String nickname;
    private String updatetime;
    private String title;
    private String article;
    private String picture;
    private String good;
    private String number;

    public Content() {

    }

    public Content(String avatar, String nickname, String updatetime, String title, String article, String picture, String good, String number) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.updatetime = updatetime;
        this.title = title;
        this.article = article;
        this.picture = picture;
        this.good = good;
        this.number = number;
    }

}
