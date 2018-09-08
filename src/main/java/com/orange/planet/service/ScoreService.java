package com.orange.planet.service;

import com.orange.planet.util.Planet;
import com.orange.planet.util.User;
import com.orange.planet.util.UserFactory;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {
    private int BASE_SCORE = 100;
    private int DONE_LEVEL = 10;

    /**
     * 浇水机制
     */
    public void watering(int userid, int planetid) {
        User user = UserFactory.getUserById(userid);
        Planet planet = user.getPlanet().get(planetid);
        int score = planet.getScore();
        int status = planet.getStatus();
        score += 1;
        checkScore(planet, score, status);
        planet.setScore(score);
    }

    /**
     * 施肥机制
     */
    public void fertilization(int userid, int planetid) {
        User user = UserFactory.getUserById(userid);
        Planet planet = user.getPlanet().get(planetid);
        int score = planet.getScore();
        int status = planet.getStatus();
        score += 5;
        checkScore(planet, score, status);
        planet.setScore(score);
    }

    private void checkScore(Planet planet, int score, int status) {
        if (score >= BASE_SCORE * planet.getPlanetType().getLevel()) {
            score = 0;
            status += 1;
            if (status >= DONE_LEVEL) {
                //todo
            }else {
                planet.setStatus(status);
                planet.setScore(score);
            }
        }
    }
}
