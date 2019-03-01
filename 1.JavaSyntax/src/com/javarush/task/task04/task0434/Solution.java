package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        long n = 1;
        while (n < 11) {
            System.out.print(n);
            System.out.print(" ");
            System.out.print(n * 2);
            System.out.print(" ");
            System.out.print(n * 3);
            System.out.print(" ");
            System.out.print(n * 4);
            System.out.print(" ");
            System.out.print(n * 5);
            System.out.print(" ");
            System.out.print(n * 6);
            System.out.print(" ");
            System.out.print(n * 7);
            System.out.print(" ");
            System.out.print(n * 8);
            System.out.print(" ");
            System.out.print(n * 9);
            System.out.print(" ");
            System.out.println(n * 10);
            n += 1;

        }

    }
}
