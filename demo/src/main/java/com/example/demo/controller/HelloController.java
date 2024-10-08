package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello,World";
    }

    // ルーティング追加
    @GetMapping("/greet")
    @ResponseBody
    public String greet() {
        return "こんにちは";
    }

    // コントローラの記述
    @GetMapping("/sayHello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/greetModel")
    public String greetModel(Model model) {
        String word = "Hello, World!(model)";
        model.addAttribute("message", word);
        return "greetModelView";
    }

}
