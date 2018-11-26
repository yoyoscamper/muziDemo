package com.learning.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Auther: 53097
 * @Date: 2018/10/15 14:33
 * @Description:
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    String[] players = {"Rafael Nadal", "Novak Djokovic",
            "Stanislas Wawrinka", "David Ferrer",
            "Roger Federer", "Andy Murray",
            "Tomas Berdych", "Juan Martin Del Potro",
            "Richard Gasquet", "John Isner"};


    @RequestMapping("/hello")
    public Object hello(){

        //匿名内部类排序
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.compareTo(o2));
            }
        });
        System.out.println("匿名内部类排序");
        Arrays.asList(players).forEach(e -> System.out.println( e ) );
        System.out.println("");

        //Lambda排序,根据name
        //Comparator<String> com = (String o1,String o2) -> o1.compareTo(o2);
        //Arrays.sort(players,com);
        Arrays.sort(players,(String o1,String o2) -> o1.compareTo(o2));
        System.out.println("Lambda排序");
        Arrays.asList(players).forEach(e -> System.out.println( e ) );
        System.out.println("");

        //Lambda排序,根据字符串长度
        Arrays.sort(players,(String o1,String o2) -> o1.length() - o2.length());
        System.out.println("Lambda排序");
        Arrays.asList(players).forEach(e -> System.out.println( e ) );
        System.out.println("");
        return "Lambda练习";


    }
}
