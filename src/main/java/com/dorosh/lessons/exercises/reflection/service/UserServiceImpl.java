package com.dorosh.lessons.exercises.reflection.service;

import com.dorosh.lessons.exercises.reflection.entity.Account;
import com.dorosh.lessons.exercises.reflection.entity.User;
import com.dorosh.lessons.exercises.reflection.repository.UserRepository;
import com.dorosh.lessons.exercises.reflection.repository.UserRepositoryImpl;
import com.dorosh.lessons.exercises.reflection.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean addAccountToUserById(Integer id, Account account) {
        User user = userRepository.getById(id);
        return user.addAccount(account);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
