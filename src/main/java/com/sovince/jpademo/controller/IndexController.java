package com.sovince.jpademo.controller;

import com.sovince.jpademo.dao.TestRepository;
import com.sovince.jpademo.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class IndexController {

    @Autowired
    private TestRepository testRepository;

    @GetMapping(value = "/")
    public List<Test> index(){
        return testRepository.findAll();
    }

    @GetMapping(value = "/test/{id}")
    public Optional<Test> test(@PathVariable(value = "id") Integer id){
        System.out.println(testRepository.findById(id));
        return testRepository.findById(id);
    }
}
