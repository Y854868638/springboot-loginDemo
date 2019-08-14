package com.it.controller;

import com.it.bean.User;
import com.it.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("index")
    public String index(){
        System.out.println(1111111);
        return "index";
    }
    @RequestMapping("login")
    @ResponseBody
    public String Login(User user){
        User user1=new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        System.out.println(user);
        User userLogin= loginService.Login(user1);
        if (userLogin!=null){

            return "hello:"+userLogin.getUsername();
        }else{
            return "not loign";
        }
    }
}
