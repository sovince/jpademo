package com.sovince.jpademo.controller;

import com.sovince.jpademo.dao.WeiboRepository;
import com.sovince.jpademo.entity.Comment;
import com.sovince.jpademo.entity.Weibo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2018/9/8
 * Time: 16:39
 */
@RestController
@RequestMapping(value = "/weibo")
public class WeiboController {

    @Autowired
    private WeiboRepository weiboRepository;

    @GetMapping(value = "/list")
    public List<Weibo> getList(){
        return weiboRepository.findAll();
    }

}
