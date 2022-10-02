package com.dorosh.lessons.exercises.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Volo");
        set.add("Volo");
        set.add("Anya");
        set.add("Andrii");
        set.add("Vasyl");
        set.add("Anna");
        set.add("Aluminium");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
//        Vasyl
//                Andrii
//        Volo
//                Anya
//        Anna

    }


}
