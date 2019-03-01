package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        double value = Double.valueOf(bufferedReader.readLine());
        if ( (value < 3)
                || (value >= 5 && value < 8)
                || (value >= 10 && value < 13)
                || (value >= 15 && value < 18)
                || (value >= 20 && value < 23)
                || (value >= 25 && value < 28)
                || (value >= 30 && value < 33)
                || (value >= 35 && value < 38)
                || (value >= 40 && value < 43)
                || (value >= 45 && value < 48)
                || (value >= 50 && value < 53)
                || (value >= 55 && value < 58)) {
            System.out.println("зелёный");
        }
        if ((value >= 3 && value < 4)
                || (value >= 8 && value < 9)
                || (value >= 13 && value < 14)
                || (value >= 18 && value < 19)
                || (value >= 23 && value < 24)
                || (value >= 28 && value < 29)
                || (value >= 33 && value < 34)
                || (value >= 38 && value < 39)
                || (value >= 43 && value < 44)
                || (value >= 48 && value < 49)
                || (value >= 53 && value < 54)
                || (value >= 58 && value < 59)
                ) {
            System.out.println("жёлтый");
        }
        if ((value >= 4 && value < 5)
                || (value >= 9 && value < 10)
                || (value >= 14 && value < 15)
                || (value >= 19 && value < 20)
                || (value >= 24 && value < 25)
                || (value >= 29 && value < 30)
                || (value >= 34 && value < 35)
                || (value >= 39 && value < 40)
                || (value >= 44 && value < 45)
                || (value >= 49 && value < 50)
                || (value >= 54 && value < 55)
                || (value >= 59 && value < 60)
                ) {
            System.out.println("красный");
        }
    }
}