package com.dorosh.lessons.exercises.nested;

public class Car {

    private String name;
    private String type;
    private Integer age;

    public static Integer WHEELS = 4;

//    public static class Engine {
//        private Integer potuznist;
//    }

    static void runEngine() {
        System.out.println("Engine started!!!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public static void main(String[] args) {
    }
}
