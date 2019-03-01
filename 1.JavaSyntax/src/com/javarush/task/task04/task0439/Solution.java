package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);
        String name = String.valueOf(bReader.readLine());

        for (int i = 10; i < 20; i++) {
            System.out.println(name + " любит меня.");
        }

    }
}
