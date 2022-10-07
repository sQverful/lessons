package com.dorosh.lessons.exercises.reflection;

import com.dorosh.lessons.exercises.reflection.annotation.MyValueAnnotation;
import com.dorosh.lessons.exercises.reflection.entity.User;
import com.dorosh.lessons.exercises.reflection.repository.UserRepositoryImpl;
import com.dorosh.lessons.exercises.reflection.service.UserService;
import com.dorosh.lessons.exercises.reflection.service.UserServiceImpl;

import java.util.List;

public class ReflectionDemo {

    public static void main(String[] args) throws NoSuchFieldException {
        UserService userService = new UserServiceImpl(new UserRepositoryImpl());
        List<User> allUsers = userService.findAllUsers();
        System.out.println(allUsers);

    }

    void reflectionExample() throws NoSuchFieldException {

        MyValueAnnotation annotation = User.class.getDeclaredField("age").getAnnotation(MyValueAnnotation.class);
        int value = annotation.value();
        String name = annotation.name();
        System.out.println(User.class.getName()
                + ": value= " + value + ","
                + " name=" + name);
    }

}
