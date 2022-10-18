package com.dorosh.lessons.exercises.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Encodings {

    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("file-to-read.txt");
        List<Character> characterList = new ArrayList<>();
        while (inputStream.available() != 0) {
            int character = inputStream.read();
            characterList.add((char) character);
        }
        
        char[] chars = new char[characterList.size()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = characterList.get(i);
        }
        String result = String.valueOf(chars);
        System.out.println(result);

        byte[] bytes = inputStream.readNBytes(10);
        int read = inputStream.read();


        BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream("test"));


    }
}
