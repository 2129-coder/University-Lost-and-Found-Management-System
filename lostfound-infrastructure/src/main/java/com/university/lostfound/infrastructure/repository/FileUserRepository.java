package com.university.lostfound.infrastructure.repository;

import java.util.ArrayList;
import java.util.List;
import com.university.lostfound.domain.model.User;

public class FileUserRepository {
    private final List<User> users = new ArrayList<>();

    public void save(User user) { users.add(user); }
    public List<User> findAll() { return new ArrayList<>(users); }
}
