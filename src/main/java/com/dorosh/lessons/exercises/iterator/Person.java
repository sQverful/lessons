package com.dorosh.lessons.exercises.iterator;

public class Person implements Comparable<Person>{

    private String name;
    private Integer age;


    @Override
    public int compareTo(Person person) {
        int result=this.name.compareTo(person.name);
        if (result==0){
            result=this.age.compareTo(person.age);
        }
        return result;
    }
}
