package com.orange.planet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @ResponseBody
    @RequestMapping("/name")
    public String getName() {
        return "orange";
    }

    @ResponseBody
    @RequestMapping("/age")
    public int getAge() {
        return 18;
    }
}
