package com.mustunal.movieactors.domain;

public class Actor {
    private long id;
    private String Name;

    public Actor() {
    }

    public Actor(long id, String name) {
        this.id = id;
        Name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
