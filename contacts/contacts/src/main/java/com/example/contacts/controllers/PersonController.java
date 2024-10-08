package com.example.contacts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PersonController {

    @GetMapping("/")
    public String index() {
        return "person/index";
    }

    /*
     * HTTPリクエストのPOSTメソッドを受けつける。
     * 
     * @PostMapping("/create") はPOSTメソッドで「/create」のURLをリクエストされた場合の処理を記述。
     */
    @PostMapping("/create")
    public String create(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        return "person/create";
    }

}