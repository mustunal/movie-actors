package com.mustunal.movieactors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie-actors")
public class MovieActorsController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

}
