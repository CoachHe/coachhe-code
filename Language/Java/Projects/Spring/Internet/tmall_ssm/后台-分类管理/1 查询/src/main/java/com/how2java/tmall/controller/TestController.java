package com.how2java.tmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("/test")
    public String test(Map<String, Object> map) {
        System.out.println("111");
        return "index";
    }

    @ModelAttribute(value = "user_name")
    public String before2(@RequestParam(required = false) String name, Model model) {
        System.out.println("进入了2：" + name);
        return name;
    }

}
