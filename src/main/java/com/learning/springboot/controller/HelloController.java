package com.learning.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Auther: 53097
 * @Date: 2018/10/15 14:33
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/hello")
    public Object hello(){
        Arrays.asList( "a", "b", "d" ).forEach(e -> System.out.println( e ) );
        return "hello~";
    }
}
