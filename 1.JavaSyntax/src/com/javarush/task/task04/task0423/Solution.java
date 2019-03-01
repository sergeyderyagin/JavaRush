package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);
        String name = bReader.readLine();
        long age = Long.valueOf(bReader.readLine());

        if (age > 20) System.out.println("И 18-ти достаточно");
    }
}
