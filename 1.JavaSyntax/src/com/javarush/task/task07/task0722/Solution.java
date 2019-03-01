package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        String string;

        while (true) {
            string = reader.readLine();
            if (string.equals("end")) {
                break;
            }
            strings.add(string);
        }

        for (String st : strings) {
            System.out.println(st);
        }

    }
}