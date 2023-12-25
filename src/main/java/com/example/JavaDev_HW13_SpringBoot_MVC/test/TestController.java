package com.example.JavaDev_HW13_SpringBoot_MVC.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class TestController {
    @GetMapping("/test")
    public ModelAndView getTest(){
        return new ModelAndView("test");
    }
}
