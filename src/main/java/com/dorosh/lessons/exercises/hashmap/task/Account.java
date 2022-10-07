package com.dorosh.lessons.exercises.hashmap.task;

public class Account {
    Integer id;
    String name;

    public Account(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}