package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.User;
import com.sprint.mission.discodeit.service.UserService;

import java.util.*;

public class JCFUserService implements UserService {
    private final Map<String, User> data = new HashMap<>();

    @Override public User create(User user) {
        data.put(user.getId(), user);
        return user;
    }
    @Override public User findById(String id) {
        return data.get(id);
    }

    @Override public List<User> findAll() {
        return new ArrayList<>(data.values());
    }

    @Override public User update(String id, String name, String nickname) {
        User u = data.get(id);
        if (u == null) throw new NoSuchElementException("User not found");
        u.update(name, nickname);
        return u;
    }
    @Override public boolean delete(String id) {
        return data.remove(id) != null;
    }
}