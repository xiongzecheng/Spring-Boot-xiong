package com.example.demo.controller;

import com.example.demo.bean.Content;
import com.example.demo.bean.Page;
import com.example.demo.bean.Top;
//import com.niit.quickStart.dao.NavigationDAO;
import com.example.demo.dao.TopDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lenovo on 2018/9/10.
 */
@Controller
public class TopController {
    @Resource
    private TopDAO topDAO;

    @GetMapping("ssp")
    public String getAll(ModelMap map){
        Top top  = topDAO.getTop();
        List<Content> contentList=topDAO.getContents();
        List<Page> pageList = topDAO.getPages();
        map.addAttribute("pageList",pageList);
        map.addAttribute("contentList",contentList);
        map.addAttribute("top",top);
        return "ssp";
        }
}
