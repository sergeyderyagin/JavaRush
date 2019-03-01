package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        String name = bufferedReader.readLine();
        String y = bufferedReader.readLine();
        String m = bufferedReader.readLine();
        String d = bufferedReader.readLine();

        System.out.println("Меня зовут " + name + "." + "\n" + "Я родился " + d + "." + m + "." + y);

    }
}
