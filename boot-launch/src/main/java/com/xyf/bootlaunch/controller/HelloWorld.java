package com.xyf.bootlaunch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xuyunfeng
 * @date :   2019/11/4 15:52
 */
@RestController
@RequestMapping("hello")
public class HelloWorld {
    @RequestMapping("world")
    public String helloWorld(){
        return "HelloWorld";
    }
}
