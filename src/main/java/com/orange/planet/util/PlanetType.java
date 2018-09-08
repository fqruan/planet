package com.orange.planet.util;

public enum PlanetType {
    ROSE(10000001, "玫瑰", 5),
    ROSA_CHINENSIS_JAVQ(10000002, "月季", 5);

    private int num;
    private String name;
    private int level;

    private PlanetType(int num, String name, int level) {
        this.num = num;
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public int getLevel() {
        return level;
    }
}
