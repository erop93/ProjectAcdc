package com.javarush.kondrashov.repository;

import com.javarush.kondrashov.entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class UserRepository  implements BaseRepository {
    private final Map<Long, User> userMap = new HashMap<>();
    private final AtomicLong id = new AtomicLong(0L);

    public UserRepository() {

    }

    @Override
    public void create(User user) {
        user.setId(id.incrementAndGet());
        update(user);
    }

    @Override
    public void update(User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void delete(User user) {
        userMap.remove(user.getId());
    }

    @Override
    public Collection<User> getAll() {
        return userMap.values();
    }

    @Override
    public Optional<User> get(long id) {
        return Optional.ofNullable(userMap.get(id));
    }
}
