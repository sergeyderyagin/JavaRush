package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<ArrayList> listForTripledWords = new ArrayList<ArrayList>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if ((s.length() % 2) == 0) {
                ArrayList<String> tripledWords = new ArrayList<String>();
                tripledWords.add(s);
                tripledWords.add(s);
                listForTripledWords.add(tripledWords);
            }


            if ((s.length() % 2) == 1) {
                ArrayList<String> tripledWords = new ArrayList<String>();
                tripledWords.add(s);
                tripledWords.add(s);
                tripledWords.add(s);
                listForTripledWords.add(tripledWords);
            }
        }

        for (int i = 0; i < listForTripledWords.size(); i++) {
            for (int j = 0; j < listForTripledWords.get(i).size(); j++) {
                System.out.print(listForTripledWords.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
