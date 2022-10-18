package com.dorosh.lessons.exercises.comparator;

import java.io.Serial;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGeneratorFactory;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person implements Comparable<Person>, Serializable {

    @Serial
    private static final long serialVersionUID = 0;

    public Person(String name, Integer age) {
        this.id = new Random().nextInt(10);
        this.name = name;
        this.age = age;
    }

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id.equals(person.id) && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Volo", 25);
        Person person2 = new Person("John", 30);
        Person person3 = new Person("Soul", 5);

        List<Person> personList = List.of(person1, person2, person3);
        System.out.println(personList);

        List<Person> newList = personList.stream().sorted()
                .collect(Collectors.toList());

        System.out.println(newList);

        List<Person> collect = newList.stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getId().compareTo(o2.getId());
                    }
                })
                .collect(Collectors.toList());



        personList.stream()
                .max(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });


        System.out.println("User 1 hashCode: " + person1.hashCode());
        System.out.println("User 2 hashCode: " + person2.hashCode());
        person2 = person1;
        System.out.println("User 2 hashCode: " + person2.hashCode());
        System.out.println("Equals: " + person1.equals(person2));
        System.out.println("person1 == person2: " + (person1 == person2));
        String str;

        Integer number = new Integer(21);
        Integer anotherNumber = 21;
        Integer anotherNumberTwo = 21;
        System.out.println(number == anotherNumber);
        System.out.println(number.equals(anotherNumber));

        String voloSameName = "Volo";
        String voloName = new String("Volo");
        var internedVolo = voloName.intern();

        System.out.println(internedVolo == voloSameName);
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return this.name + " is " + this.age;
    }
}
