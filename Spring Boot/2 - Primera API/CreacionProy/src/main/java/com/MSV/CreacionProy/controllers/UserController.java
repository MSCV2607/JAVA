package com.MSV.CreacionProy.controllers;

import com.MSV.CreacionProy.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {

        User user = new User("Mauro","Vecc");
        user.setEmail("Mauro@Vecc");

        model.addAttribute("title:", "Hola mundo spring");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();

        model.addAttribute("users", users);
        model.addAttribute("title:", "Listado de usuarios");
        return "list";
    }
}
