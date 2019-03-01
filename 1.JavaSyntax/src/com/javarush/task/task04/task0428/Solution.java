package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader iReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(iReader);
        Long a1 = Long.valueOf(bReader.readLine());
        Long a2 = Long.valueOf(bReader.readLine());
        Long a3 = Long.valueOf(bReader.readLine());

        if ((a1 > 0) && (a2 > 0) && (a3 > 0)) System.out.println(3);
        else if (((a1 > 0) && (a2 > 0)) || ((a2 > 0) && (a3 > 0)) || ((a3 > 0) && (a1 > 0))) System.out.println(2);
        else if ((a1 > 0) || (a2 > 0) || (a3 > 0)) System.out.println(1);
        else System.out.println(0);
    }
}
