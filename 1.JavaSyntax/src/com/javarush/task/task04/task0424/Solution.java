package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(iReader);
        long a1 = Long.valueOf(bufferedReader.readLine());
        long a2 = Long.valueOf(bufferedReader.readLine());
        long a3 = Long.valueOf(bufferedReader.readLine());

        if (a1 != a2 && a2 == a3) System.out.println(1);
        if (a2 != a3 && a3 == a1) System.out.println(2);
        if (a3 != a1 && a1 == a2) System.out.println(3);


    }
}
