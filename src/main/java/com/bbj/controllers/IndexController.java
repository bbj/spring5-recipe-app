package com.bbj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller                                         //make it a Spring Bean
public class IndexController {

    @RequestMapping({"","/", "/index"})      //when we go to these URLs, getIndexPage() is called
    public String getIndexPage() {
        System.out.println("getIndexPage() called OK omg!");
        return "index";                             //will try to go against a Thymeleaf template index
    }
}
