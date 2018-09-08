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
     * */
    public void watering(int userid, int planetid) {
        User user = UserFactory.getUserById(userid);
        Planet planet = user.getPlanet().get(planetid);
        int score = planet.getScore();
        int status = planet.getStatus();
        score += 1;
        if (score >= BASE_SCORE * planet.getPlanetType().getLevel()) {
            score = 0;
            status += 1;
            planet.setStatus(status);
            if (status >= DONE_LEVEL) {
                //todo 栽培完成
            }
        }
        planet.setScore(score);
    }
}
