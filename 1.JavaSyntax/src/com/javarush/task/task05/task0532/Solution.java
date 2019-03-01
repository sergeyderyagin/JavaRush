package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(reader.readLine());
        int maximum = -2147483648;


        while (n > 0) {
            int num = Integer.valueOf(reader.readLine());
            if (maximum <= num) maximum = num;
            n -= 1;
        }

        System.out.println(maximum);
    }
}