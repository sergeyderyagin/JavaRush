package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> mylist = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            mylist.add(Integer.valueOf(reader.readLine()));
        }

        for (int i = mylist.size() - 1; i > 0; i--) {
            for (int j = 0; j < mylist.size() - 1; j++) {
                if (mylist.get(j) > mylist.get(j + 1)) {
                    int a = mylist.get(j);
                    mylist.set(j, mylist.get(j + 1));
                    mylist.set(j + 1, a);
                }
            }
        }
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }


}
