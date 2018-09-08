package com.orange.planet.service;

import com.orange.planet.util.Planet;
import com.orange.planet.util.PlanetType;
import com.orange.planet.util.User;
import com.orange.planet.util.UserFactory;
import org.springframework.stereotype.Service;

@Service
public class PlanetService {
    /**
     * 添加新植物
     * */
    public void addPlanet(int userid, PlanetType planetType) {
        Planet planet = new Planet(planetType);
        User user = UserFactory.getUserById(userid);
        user.getPlanet().add(planet);
    }

    /**
     * 删除植物
     * */
    public void delPlanet(int userid, int planetid) {
        User user = UserFactory.getUserById(userid);
        user.getPlanet().remove(planetid);
    }
}
