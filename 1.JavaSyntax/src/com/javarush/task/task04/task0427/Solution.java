package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(inputReader);
        long a = Long.valueOf(bReader.readLine());
        if ((a % 2 == 0) && (a > 0) && (a < 10)) System.out.println("четное однозначное число");
        else if ((a % 2 == 0) && (a >= 10) && (a < 100)) System.out.println("четное двузначное число");
        else if ((a % 2 == 0) && (a >= 100) && (a <= 999)) System.out.println("четное трехзначное число");
        else if ((a % 2 == 1) && (a > 0) && (a < 10)) System.out.println("нечетное однозначное число");
        else if ((a % 2 == 1) && (a >= 10) && (a < 100)) System.out.println("нечетное двузначное число");
        else if ((a % 2 == 1) && (a >= 100) && (a <= 999)) System.out.println("нечетное трехзначное число");


    }
}
