package com.dorosh.lessons.exercises.set;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Device> devices = new TreeSet<>();

        devices.add(new Device(123456L, "LG", "Tv", 1200));
        devices.add(new Device(7566212L, "Apple", "Iphone 11", 1023));
        devices.add(new Device(95126L, "Samsung", "Tablet", 450));
        devices.add(new Device(7566212L, "Apple", "Iphone 11 Pro Max", 1350));
        devices.add(new Device(7566212L, "Apple", "Iphone 11 Mini", 2));

        for (Device device : devices) {
            System.out.println(device);
        }
        System.out.println("=========================================================");
        System.out.println(devices);

    }
}
