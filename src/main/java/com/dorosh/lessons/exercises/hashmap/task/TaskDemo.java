package com.dorosh.lessons.exercises.hashmap.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskDemo {

    public static void main(String[] args) {
        // write your code here
        Account ac1 = new Account(1,"acc1");
        Account ac2 = new Account(2,"acc2");
        Account ac3 = new Account(3,"acc3");

        Person p1 = new Person(1,"pers1");
        Person p2 = new Person(2,"pers2");
        Person p3 = new Person(3,"pers3");

        Map<Person, List<Account>> map2 = new HashMap<Person,List<Account>>();

        map2.put(p1,new ArrayList<Account>());
        map2.get(p1).add(ac1);
        map2.get(p1).add(ac3);

        map2.put(p2, Arrays.asList(ac3,ac2));
        map2.put(p3,Arrays.asList(new Account(4,"acc4")));

        map2.get(p1).remove(ac3);
        //map2.remove(p1);
        map2.put(p1,Arrays.asList(new Account(5,"acc5")));


        System.out.println(map2);

        // Map<User,Account> map1 = new HashMap<User,Account>();

        // map1.put(p1,ac1);
        // map1.put(p2,ac2);
        //  map1.put(p3,ac3);

        //  map1.put(new User(4,"pers4"),new Account(4,"acc4"));
        // map1.put(p2,null);
        //  map1.put(null,ac2);

        //  map1.remove(p2);

        // System.out.println(map1);

    }
}
