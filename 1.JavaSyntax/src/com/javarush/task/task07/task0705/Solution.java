package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list1 = new int[20];
        int[] list2 = new int[10];
        int[] list3 = new int[10];



        for (int i = 0; i < list2.length; i++) {
            list1[i] = Integer.valueOf(reader.readLine());
            list2[i] = list1[i];
        }

        for (int i = list3.length; i < list2.length + list3.length; i++) {
            list1[i] = Integer.valueOf(reader.readLine());
            list3[i - list2.length] = list1[i];
        }

        for (int i = 0; i < list3.length; i++) {
            System.out.println(list3[i]);
        }
    }
}
