package com.orange.planet.util;

public class Planet {
    private PlanetType planetType;
    private int score;
    private int status;

    public Planet(PlanetType planetType) {
        this.planetType = planetType;
        this.score = 0;
        this.status = 0;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "planetType=" + planetType +
                ", score=" + score +
                ", status=" + status +
                '}';
    }
}
