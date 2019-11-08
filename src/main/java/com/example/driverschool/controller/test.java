package com.example.driverschool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "test" )
public class test {

    @RequestMapping( "test" )
    public void test1 () {
        try {
            System.out.println( "接受到了" );
        } catch ( Exception e ) {
            System.out.println( "接受不到" );
        }
    }
}
