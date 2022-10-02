package com.dorosh.lessons.exercises.set;

import java.util.Objects;

public class Device implements Comparable<Device> {

    private long id;
    private String brand;
    private String name;
    private double price;

    public Device(long id, String brand, String name, double price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Device#equals()");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return id == device.id &&
                Double.compare(device.price, price) == 0 &&
                brand.equals(device.brand) &&
                name.equals(device.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Device#hashCode()");
        return Objects.hash(id, brand, name, price);
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Device o) {
//        System.out.println("Device#compareTo()");
        int result = this.brand.compareTo(o.brand);
        if(result == 0){
            result = (int)(this.price - o.price);
        }
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
