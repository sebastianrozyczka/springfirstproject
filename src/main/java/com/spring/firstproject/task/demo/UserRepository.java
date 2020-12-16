package com.spring.firstproject.task.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    UserRepository() {
        users.add(new User("Sebastian", "Rozyczka", 23));
        users.add(new User("Artur", "Walczak", 29));
        users.add(new User("Karol", "Kowalczyk", 34));
    }

    public List<User> getAll() {
        return users;
    }

    public void add(User user) {
        users.add(user);
    }
}
