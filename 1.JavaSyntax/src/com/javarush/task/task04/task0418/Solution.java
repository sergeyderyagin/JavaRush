package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader sReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(sReader);
        int a1 = Integer.valueOf(bReader.readLine());
        int a2 = Integer.valueOf(bReader.readLine());
        if (a1 < a2) System.out.println(a1);
        else if (a1 > a2) System.out.println(a2);
        else System.out.println(a2);
    }
}