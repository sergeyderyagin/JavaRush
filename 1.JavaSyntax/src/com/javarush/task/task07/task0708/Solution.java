package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<>();
    private static ArrayList<Integer> strSizesList = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());
        }

        for (int i = 0; i < strings.size(); i++) {
            strSizesList.add(strings.get(i).length());
        }



        for (int i = strSizesList.size() - 1; i > 0; i--) {
            for (int j = 0; j < strSizesList.size() - 1; j++) {
                if (strSizesList.get(j) > strSizesList.get(j + 1)) {
                    int a = strSizesList.get(j);
                    strSizesList.set(j, strSizesList.get(j + 1));
                    strSizesList.set(j + 1, a);
                }
            }
        }

        int max = strSizesList.get(strSizesList.size() - 1);
        strSizesList.clear();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max) {
                strSizesList.add(i);
            }
        }

        for (int i = 0; i < strSizesList.size(); i++) {
            System.out.println(strings.get(strSizesList.get(i)));

        }

    }
}
