package ru.spring.service;

import ru.spring.model.User;

import java.util.List;

public interface UserService {
    void add (User user);
    List<User> listUsers();
    User findById(long id);
    void update(User user);
    void deleteById(long id);
    void deleteAll();
}
