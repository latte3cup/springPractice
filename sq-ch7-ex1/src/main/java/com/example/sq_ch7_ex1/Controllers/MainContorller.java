package com.example.sq_ch7_ex1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainContorller {

    @RequestMapping("/home")
    public String home(){
        return "home.html";
    }
}
