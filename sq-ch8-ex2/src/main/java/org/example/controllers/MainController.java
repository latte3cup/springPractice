package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(@PathVariable(required=false) String color,
                       @RequestParam(required = true) String name,
                       Model page) {
        page.addAttribute("username", name);    //매개변수 default가 지정된 것과 같음
        page.addAttribute("color", color);                    // 매개변수가 완전 동적
        return "home.html";
    }
}