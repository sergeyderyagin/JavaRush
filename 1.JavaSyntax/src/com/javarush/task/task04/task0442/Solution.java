package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        int result = 0;
        while (true) {
            int num = Integer.valueOf(bufferedReader.readLine());
            if (num == -1) {
                System.out.println(result + num);
                break;
            }
            result += num;
        }

    }
}
