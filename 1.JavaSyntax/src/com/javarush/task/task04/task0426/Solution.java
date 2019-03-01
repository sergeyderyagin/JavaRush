package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(inputReader);
        long a = Long.valueOf(bReader.readLine());
        if ((a % 2 == 0) && (a < 0)) System.out.println("отрицательное четное число");
        else if (a % 2 == -1) System.out.println("отрицательное нечетное число");
        else if (a == 0) System.out.println("ноль");
        else if ((a % 2 == 0) && (a > 0)) System.out.println("положительное четное число");
        else if (a % 2 == 1) System.out.println("положительное нечетное число");

    }
}
