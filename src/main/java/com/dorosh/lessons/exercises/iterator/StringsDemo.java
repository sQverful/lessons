package com.dorosh.lessons.exercises.iterator;

public class StringsDemo {

    public static void main(String[] args) {
        System.out.println(returnWordThatStartsWithS("Input string should work and return string word"));
        System.out.println(returnWordThatStartsWithSAnotherApproach("Input string should work and return string word"));

    }

    public static String returnWordThatStartsWithS(String inputString) {
        String[] strArr = inputString.split(" ");
        for (String str : strArr) {
            if (str.startsWith("s"))
                return str;
        }
        return null;
    }

    public static String returnWordThatStartsWithSAnotherApproach(String inputString) {
        String[] strArr = inputString.split(" ");
        for (String str : strArr) {
            if (str.indexOf("s") == 0)
                return str;
        }
        return null;
    }
}
