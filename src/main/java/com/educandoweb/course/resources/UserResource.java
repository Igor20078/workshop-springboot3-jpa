package com.educandoweb.course.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserResource  {

    @GetMapping
    public String home() {
        return "Aplicação está rodando!";
    }
}

