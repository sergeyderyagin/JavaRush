package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(reader.readLine());
        int m = Integer.valueOf(reader.readLine());

        ArrayList<String> stringsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            stringsList.add(reader.readLine());
        }


        for (int i = 0; i < m; i++) {
            stringsList.add(stringsList.get(0));
            stringsList.remove(0);
        }

        for (String aS : stringsList) {
            System.out.println(aS);
        }
    }
}
