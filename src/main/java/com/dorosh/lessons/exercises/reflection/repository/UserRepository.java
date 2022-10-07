package com.dorosh.lessons.exercises.reflection.repository;

import com.dorosh.lessons.exercises.reflection.entity.User;

import java.util.List;

public interface UserRepository {

    User getById(Integer id);

    List<User> findAll();
}
