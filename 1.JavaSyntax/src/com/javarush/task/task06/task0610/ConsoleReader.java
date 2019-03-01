package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        return bufferedReader.readLine();
    }

    public static int readInt() throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        return Integer.parseInt(bufferedReader.readLine());

    }

    public static double readDouble() throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        return Double.parseDouble(bufferedReader.readLine());


    }

    public static boolean readBoolean() throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        return Boolean.parseBoolean(bufferedReader.readLine());


    }

    public static void main(String[] args) {

    }
}
