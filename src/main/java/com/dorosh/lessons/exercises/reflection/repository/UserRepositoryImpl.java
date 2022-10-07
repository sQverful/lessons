package com.dorosh.lessons.exercises.reflection.repository;

import com.dorosh.lessons.exercises.reflection.entity.User;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserRepositoryImpl implements UserRepository {

    private Map<Integer, User> container;

    public UserRepositoryImpl() {
        container = Stream.of(
                        new User(1, "John", "john@gmail.com"),
                        new User(2, "Volo", "volo@gmail.com"),
                        new User(3, "David", "david@gmail.com"),
                        new User(4, "Olha", "olha@gmail.com"
                        ))
                .collect(Collectors.toMap(User::getId, Function.identity()));
    }

    @Override
    public User getById(Integer id) {
        return container.get(id);
    }

    @Override
    public List<User> findAll() {
        return container
                .values()
                .stream()
                .toList();
    }

}
