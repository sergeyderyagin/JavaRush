package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);

        long summa = 0;
        while (true) {
            String myNumber = bReader.readLine();
            if (myNumber.equals("сумма")) {
                break;
            }
            summa += Long.valueOf(myNumber);
        }
        System.out.println(summa);

    }
}
