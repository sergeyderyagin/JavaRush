package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);
        String name = bReader.readLine();
        long age = Long.valueOf(bReader.readLine());

        if (age < 18) System.out.println("Подрасти еще");
    }
}
