package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] streetList = new int[15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 15; i++) {
            streetList[i] = Integer.valueOf(reader.readLine());
        }


        int a = 0;
        int b = 0;

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                a += streetList[i];
            } else b += streetList[i];
        }

        System.out.println(a > b ? "В домах с четными номерами проживает больше жителей." : "В домах с нечетными номерами проживает больше жителей.");


    }
}
