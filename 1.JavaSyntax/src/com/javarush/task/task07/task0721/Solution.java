package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int [] arrayInt = new int[20];

        for (int i = 0; i < arrayInt.length; i++ ) {
            arrayInt[i] = Integer.valueOf(reader.readLine());
        }

        int maximum;
        int minimum;

        maximum = arrayInt[0];
        minimum = arrayInt[0];


        for (int num : arrayInt) {
            if (maximum < num) {
                maximum = num;
            }

            if (minimum > num) {
                minimum = num;
            }
        }


        System.out.print(maximum + " " + minimum);
    }
}
