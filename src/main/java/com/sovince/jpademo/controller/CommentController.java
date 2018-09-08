package com.sovince.jpademo.controller;

import com.sovince.jpademo.dao.CommentResitory;
import com.sovince.jpademo.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by vince
 * Email: so_vince@outlook.com
 * Data: 2018/9/8
 * Time: 17:24
 */
@RestController
@RequestMapping(value = "comment")
public class CommentController {

    @Autowired
    private CommentResitory commentResitory;

    @GetMapping(value = "list")
    public List<Comment> getList(){
        return commentResitory.findAll();
    }

    @GetMapping(value = "item/{id}")
    public Comment getById(@PathVariable(value = "id") long id){
        return commentResitory.getByCommentIdIs(id);
    }
}
