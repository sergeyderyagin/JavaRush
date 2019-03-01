package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        long value1 = Long.valueOf(bufferedReader.readLine());
        long value2 = Long.valueOf(bufferedReader.readLine());
        long value3 = Long.valueOf(bufferedReader.readLine());

        if ( (value1 == value2) && (value1 == value3)) {
            System.out.print(value1 + " ");
            System.out.print(value2 + " ");
            System.out.println(value3);
        }

        else if (value1 == value2) {
            System.out.print(value1 + " ");
            System.out.println(value2);
        }

        else if (value2 == value3) {
            System.out.print(value2 + " ");
            System.out.println(value3);
        }

        else if (value3 == value1) {
            System.out.print(value3 + " ");
            System.out.println(value1);
        }
    }
}