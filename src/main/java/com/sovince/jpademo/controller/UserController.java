package com.sovince.jpademo.controller;

import com.sovince.jpademo.dao.UserRepository;
import com.sovince.jpademo.entity.User;
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
 * Time: 15:58
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/list")
    public List<User> getList(){
        return userRepository.findAll();
    }

    @GetMapping(value = "/listByUsername/{username}")
    public List<User> getListByNameLike(@PathVariable(value = "username") String usernme){
        return userRepository.getByUsernameContaining(usernme);
    }

    @GetMapping(value = "/item/{id}")
    public User getById(@PathVariable(value = "id") long id){
        return userRepository.getByUserId(id);
    }

    @GetMapping(value = "/itemByUsername/{username}")
    public User getByUsername(@PathVariable(value = "username") String username){
        return userRepository.getByUsernameIs(username);
    }
}
