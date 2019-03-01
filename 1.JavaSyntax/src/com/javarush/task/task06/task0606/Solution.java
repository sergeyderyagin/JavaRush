package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(java.lang.String[] args) throws IOException {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);

        String line = bufferedReader.readLine();
        int num;

        for (int i = 0; i < line.length(); i++) {
            num = Character.getNumericValue(line.charAt(i));
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
