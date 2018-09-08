package com.orange.planet.util;

import org.junit.Test;

public class TestPlanetType {

    @Test
    public void testOut() {
        System.out.println(PlanetType.ROSE);
    }

    @Test
    public void testGetName() {
        System.out.println(PlanetType.ROSE.getName());
    }

    @Test
    public void testGetNum() {
        System.out.println(PlanetType.ROSE.getNum());
    }
}
