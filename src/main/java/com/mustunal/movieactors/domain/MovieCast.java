package com.mustunal.movieactors.domain;

import java.util.ArrayList;
import java.util.List;

public class MovieCast {

    private long id;
    private List<Actor> actorList = new ArrayList<>();

    public MovieCast() {
    }

    public MovieCast(long id, List<Actor> actorList) {
        this.id = id;
        this.actorList = actorList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }
}
