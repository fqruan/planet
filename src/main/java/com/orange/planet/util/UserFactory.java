package com.orange.planet.util;

import java.util.HashMap;

public class UserFactory {
    private static HashMap<Integer, User> userMap;

    private UserFactory() {

    }

    public static User getUserById(int id) {
        if (userMap.containsKey(id)) {
            return userMap.get(id);
        }else {
            User user = new User(id, "用户：" + id);
            userMap.put(id, user);
            return user;
        }
    }
}
