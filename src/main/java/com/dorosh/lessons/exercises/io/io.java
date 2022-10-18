package com.dorosh.lessons.exercises.io;

import com.dorosh.lessons.exercises.comparator.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;


public class io {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

////        FileWriter fileWriter = new FileWriter("test");
//        ObjectOutput objectOutputStream = new ObjectOutputStream(new FileOutputStream("myname.txt"));
//        Person person = new Person("name", 25);
//        objectOutputStream.writeObject(person);

//        FileReader fileReader = new FileReader("myname.txt");
        ObjectInput objectInput = new ObjectInputStream(new FileInputStream("myname.txt"));
        Person person = (Person) objectInput.readObject();

        System.out.println(person);
    }
}
