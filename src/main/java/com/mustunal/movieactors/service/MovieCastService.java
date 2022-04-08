package com.mustunal.movieactors.service;

import com.mustunal.movieactors.domain.MovieCast;
import com.mustunal.movieactors.repository.MovieCastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieCastService {
    private final MovieCastRepository movieCastRepository;

    @Autowired
    public MovieCastService(MovieCastRepository movieCastRepository) {
        this.movieCastRepository = movieCastRepository;
    }


    public MovieCast getMovieCastByMovieId(long id) {
        return movieCastRepository.getMovieCastByMovieId(id);
    }
}
