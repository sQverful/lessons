package com.dorosh.lessons.exercises.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Volo");
        set.contains("Volo");
        set.add("Volo");
        set.add("Anya");
        set.add("Andrii");
        set.add("Vasyl");
        set.add("Anna");

        //
        set.add("Aluminium");
        HashMap<String, String> hashMap = new HashMap<>();



        hashMap.put("", "Aluminium");



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


    void test() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aluminium");
        map.put(1, "John");
        System.out.println(map);
    }
}
