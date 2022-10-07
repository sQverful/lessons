package com.dorosh.lessons.exercises.hashmap.task;

public class Person {
    Integer id;
    String name;

    public Person(Integer id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
