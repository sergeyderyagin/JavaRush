package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String a = reader.readLine();

        int number = Integer.valueOf(a);

        if (number > 0) System.out.println(number * 2);
        if (number < 0) System.out.println(number + 1);
        if (number == 0) System.out.println(0);
    }

}