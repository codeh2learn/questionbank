package com.codeh.questionbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionBankController {
    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }


    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
