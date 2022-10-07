package com.dorosh.lessons.exercises.reflection.entity;

import com.dorosh.lessons.exercises.reflection.annotation.MyValueAnnotation;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static final Integer ACCOUNT_LIMIT = 5;
    private Integer id;
    private String name;
    private String email;

    @MyValueAnnotation(name = "age", value = 22)
    private Integer age;
    private List<Account> accountList;


    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        accountList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean addAccount(Account account) {
        return accountList.add(account);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
