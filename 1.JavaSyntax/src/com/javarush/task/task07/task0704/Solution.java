package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];
        for (int i = list.length - list.length; i < list.length; i++) {
            list[i] = Integer.valueOf(reader.readLine());
        }

        for (int i = list.length - 1; i > (list.length - list.length) - 1; i--) {
            System.out.println(list[i]);
        }
    }
}

