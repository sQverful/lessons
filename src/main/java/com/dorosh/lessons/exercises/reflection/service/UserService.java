package com.dorosh.lessons.exercises.reflection.service;

import com.dorosh.lessons.exercises.reflection.entity.Account;
import com.dorosh.lessons.exercises.reflection.entity.User;

import java.util.List;

public interface UserService {

    boolean addAccountToUserById(Integer id, Account account);

    List<User> findAllUsers();
}
