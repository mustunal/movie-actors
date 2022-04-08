package com.mustunal.movieactors.repository;

import com.mustunal.movieactors.domain.Actor;
import com.mustunal.movieactors.domain.MovieCast;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class MovieCastRepository {
    private final Map<Long,MovieCast> movieCastMap = new HashMap<>();

    public MovieCastRepository() {
        initMovieCastMap();
    }

    private void initMovieCastMap() {
        List<Actor> actorList = new ArrayList<>();
        Actor actor = new Actor(1,"Tim Robbins");
        actorList.add(actor);
        actor = new Actor(2,"Morgan Freeman");
        actorList.add(actor);
        MovieCast movieCast = new MovieCast(1,actorList);
        movieCastMap.put(1L,movieCast);

        actorList = new ArrayList<>();
        actor = new Actor(3,"Brad Pitt");
        actorList.add(actor);
        actor = new Actor(4,"Edward Norton");
        actorList.add(actor);
        movieCast = new MovieCast(2,actorList);
        movieCastMap.put(2L,movieCast);

        actorList = new ArrayList<>();
        actor = new Actor(5,"Al Pacino");
        actorList.add(actor);
        actor = new Actor(6,"Robert De Niro");
        actorList.add(actor);
        movieCast = new MovieCast(3,actorList);
        movieCastMap.put(3L,movieCast);
    }

    public MovieCast getMovieCastByMovieId(long id) {
        return movieCastMap.get(id);
    }
}
