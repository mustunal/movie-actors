package com.mustunal.movieactors.controller;

import com.mustunal.movieactors.domain.MovieCast;
import com.mustunal.movieactors.service.MovieCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movie-actors")
public class MovieActorsController {

    private final MovieCastService movieCastService;

    @Autowired
    public MovieActorsController(MovieCastService movieCastService) {
        this.movieCastService = movieCastService;
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/{id}")
    public MovieCast getMovieCastByMovieId(@PathVariable long id){
        return movieCastService.getMovieCastByMovieId(id);
    }
}
