package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(inputReader);

        int counter = 0;
        int num = Integer.valueOf(bReader.readLine());
        float result = 0;

        while (num != -1) {
            result += num;
            counter += 1;
            num = Integer.valueOf(bReader.readLine());
        }

        System.out.println(result / counter);

    }
}

