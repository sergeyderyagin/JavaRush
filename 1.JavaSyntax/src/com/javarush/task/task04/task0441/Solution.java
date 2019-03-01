package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        int num1 = Integer.valueOf(bufferedReader.readLine());
        int num2 = Integer.valueOf(bufferedReader.readLine());
        int num3 = Integer.valueOf(bufferedReader.readLine());

        if (num1 < num2 && num2 < num3) {
            System.out.println(num2);
        }
        else if (num2 < num3 && num3 < num1) {
            System.out.println(num3);
        }
        else if (num3 < num1 && num1 < num2) {
            System.out.println(num1);
        }

        else if (num1 == num2 && num2 == num3){System.out.println(num1);}

        else if (num1 == num2){
            System.out.println(num1);
        }
        else if (num2 == num3){
            System.out.println(num2);
        }
        else if (num3 == num1){
            System.out.println(num1);
        }

    }
}
