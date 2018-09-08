package com.orange.planet.util;

import java.util.ArrayList;

public class User {
    private ArrayList<Planet> planetList;
    private String username;
    private int userId;

    public User() {
        planetList = new ArrayList<>();
    }

    public User(int id, String name) {
        userId = id;
        username = name;
        planetList = new ArrayList<>();
    }

    public ArrayList<Planet> getPlanet() {
        return planetList;
    }

    public void setPlanetTypeList(ArrayList<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "planets_count=" + planetList.size() +
                ", username='" + username + '\'' +
                ", userId=" + userId +
                '}';
    }
}
