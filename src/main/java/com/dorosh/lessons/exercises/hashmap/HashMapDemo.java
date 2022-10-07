package com.dorosh.lessons.exercises.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<Key, String> hash = new TreeMap<>();
        Key key1 = new Key(1, "standart");
        Key key2 = new Key(2, "non-standart");
        Key key3 = new Key(3, "usual");
        Key key4 = new Key(4, "usual");
        Key key5 = new Key(5, "usual");



        hash.put(key3, "Bart");
        hash.put(key4, "Bart");
        hash.put(key5, "Bart");
        hash.put(key1, "Andrii");
        hash.put(key2, "Anton");

        System.out.println(hash);


    }
}
class Key implements Comparable<Key> {
    public Key(Integer id, String type) {
        this.type = type;
        this.id = id;
    }
    private String type;
    private Integer id;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Key key)) return false;
        return Objects.equals(this.getType(), key.getType()) && Objects.equals(getId(), key.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(), getId());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Key{" +
                "type='" + type + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Key o) {
        return this.id.compareTo(o.getId());
    }
}
