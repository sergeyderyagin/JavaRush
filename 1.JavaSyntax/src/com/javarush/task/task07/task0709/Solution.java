package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> strSizesList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(i, reader.readLine());
        }

        // создание списка из длин строк из списка "strings"
        for (int i = 0; i < strings.size(); i++) {
            strSizesList.add(strings.get(i).length());
        }

        // сортировка списка по возростанию
        for (int i = strSizesList.size() - 1; i > 0; i--) {
            for (int j = 0; j < strSizesList.size() - 1; j++) {
                if (strSizesList.get(j) > strSizesList.get(j + 1)) {
                    int a = strSizesList.get(j);
                    strSizesList.set(j, strSizesList.get(j + 1));
                    strSizesList.set(j + 1, a);
                }
            }
        }

        // создание списка из индексов списка "strings" в котором строка имеет минимальную длину
        int min = strSizesList.get(0);
        strSizesList.clear();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == min) {
                strSizesList.add(i);
            }
        }

        for (int i = 0; i < strSizesList.size(); i++) {
            System.out.println(strings.get(strSizesList.get(i)));

        }

    }
}
