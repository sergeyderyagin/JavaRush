package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);
        long a = Long.valueOf(bufferedReader.readLine());
        long b = Long.valueOf(bufferedReader.readLine());

        if (a > 0 &&  b > 0) System.out.println(1);
        if (a < 0 &&  b > 0) System.out.println(2);
        if (a < 0 &&  b < 0) System.out.println(3);
        if (a > 0 &&  b < 0) System.out.println(4);


    }
}
