package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] strlist = new String[10];
        int[] intList = new int[10];

        for (int i = 0; i < strlist.length; i++) {
            strlist[i] = reader.readLine();
            intList[i] = strlist[i].length();
            System.out.println(intList[i]);
        }
    }
}
