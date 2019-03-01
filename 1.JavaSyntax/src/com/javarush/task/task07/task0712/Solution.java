package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> sortedListByLength = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(i, reader.readLine());
        }

        // узнаем длины строк и складываем их в список
        for (int i = 0; i < strings.size(); i++) {
            sortedListByLength.add(strings.get(i).length());
        }

        // сортируем список
        for (int i = sortedListByLength.size() - 1; i > 0; i--) {
            for (int j = 0; j < sortedListByLength.size() - 1; j++) {
                if (sortedListByLength.get(j) > sortedListByLength.get(j + 1)) {
                    int a = sortedListByLength.get(j);
                    sortedListByLength.set(j, sortedListByLength.get(j + 1));
                    sortedListByLength.set(j + 1, a);
                }
            }
        }


        // Узнаем макс и мин длину строк
        int min = sortedListByLength.get(0);
        int max = sortedListByLength.get(sortedListByLength.size() - 1);
        String max1 = null;
        String min1 = null;

        int maxStringIndex = 0;
        int minStringIndex = 0;


        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max) {
                max1 = strings.get(i);
                maxStringIndex = i;
                break;
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min) {
                min1 = strings.get(i);
                minStringIndex = i;
                break;
            }
        }

        System.out.println(maxStringIndex > minStringIndex ? min1 : max1);


    }
}
