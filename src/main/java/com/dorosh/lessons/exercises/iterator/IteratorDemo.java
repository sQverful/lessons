package com.dorosh.lessons.exercises.iterator;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection;
        collection = new ArrayList<>();
        collection.add("Anya");
        collection.add("Volo");
        collection.add("John");

        // at least 3 ways to iterate on a Collection

        // 1
        for (String obj : collection) {
            System.out.println(obj);

        }


        System.out.println("====================");
        // 2
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("Anya")) {
                iterator.remove();
            }
            System.out.println(next);
        }
        System.out.println(collection);

        //3
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("dhr");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            System.out.println(stringListIterator.next() + " index: "
                    + stringListIterator.nextIndex());
        }




    }
}
