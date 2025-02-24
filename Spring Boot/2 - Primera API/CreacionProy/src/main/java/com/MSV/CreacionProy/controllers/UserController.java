package com.MSV.CreacionProy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {

        model.addAttribute("title","Hola Mundo con Spring");
        model.addAttribute("name","Mauro");
        model.addAttribute("lastName","Vecc");
        return "details";
    }
}
