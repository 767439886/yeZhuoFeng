package com.example.driverschool.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.driverschool.common.Result ;

@RequestMapping( "/register" )
public class register{

    //  增加用户
    @GetMapping( "/addUser" )
    public Result addUser () {
        try {

            return new Result( "注册成功" , true   ) ;
        } catch ( Exception e ) {
            return new Result( "注册失败" , false ) ;
        }
    }
}
