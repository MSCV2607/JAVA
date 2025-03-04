package com.MSV.CreacionProy.controllers;

import com.MSV.CreacionProy.DTO.UserDto;
import com.MSV.CreacionProy.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
//Ruta principal
@RequestMapping("/api")
public class UserRestController {
    //Inutilizado
    @GetMapping("/details")
    public Map<String, Object> details() {

        User user = new User("Andres","Rolon");


        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola mundo con Spring");
        body.put("name", user);


        return body;
    }

    //Devuelve una lista
    @GetMapping("/list")
    public List<User> list() {
        User user1 = new User("Andres","Rolon");
        User user2 = new User("Pepe","Rol");
        User user3 = new User("Jhon","Ro");

        //Simplifica lo de abajo
        List<User> users = Arrays.asList(user1, user2, user3);

//        List <User> users = new ArrayList<>();
//        users.add(user1);
//        users.add(user2);
//        users.add(user3);

        return users;
    }

    //USANDO DTO
    @GetMapping("/details-map")
    public UserDto detailsMap() {

        UserDto userDto = new UserDto();

        User user = new User("Andres","Rolon");

        userDto.setUser(user);
        userDto.setTitle("Hola mundo con Spring");

        return userDto;
    }
}
