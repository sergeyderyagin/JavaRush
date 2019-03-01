package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        String myString = bufferedReader.readLine();
        long number = Long.valueOf(bufferedReader.readLine());

        while (number > 0) {
            System.out.println(myString);
            number -= 1;
        }


    }
}
