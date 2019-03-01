package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(streamReader);
        long a1 = Long.valueOf(reader.readLine());
        long a2 = Long.valueOf(reader.readLine());
        long a3 = Long.valueOf(reader.readLine());

        if (a3 <= a2 && a2 <= a1) {
            System.out.print(a2 + " " + a1 + " " + a3);
        }

        else if (a2 <= a1 && a1 <= a3) {
            System.out.print(a3 + " " + a1 + " " + a2);
        }

        else if (a1 <= a3 && a3 <= a2) {
            System.out.print(a3 + " " + a2 + " " + a1);
        }

    }
}
