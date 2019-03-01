package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numList = new ArrayList<Integer>();

        int lenList = 10;

        for (int i = 0; i < lenList; i++) {
            numList.add(Integer.valueOf(reader.readLine()));
        }

        for (int i = 0; i < lenList; i++) {
            Integer integer = numList.get(lenList - i - 1);
            System.out.println(integer);
        }


    }
}
