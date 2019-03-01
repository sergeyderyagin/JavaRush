package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        Boolean p = false;
        Boolean l = false;
        int i = 0;

        while (true) {
            if (i == list.size()) {
                break;
            }
            // Проверяем буквы в слове
            for (int j = 0; j < list.get(i).length(); j++) {
                Character character = list.get(i).charAt(j);
                if (character.toString().equals("р")) {
                    p = true;
                }
                if (character.toString().equals("л")) {
                    l = true;
                }
            }
            if (!p && l) {
                list.add(i, list.get(i));
                i++;
            }
            if (p && !l) {
                list.remove(i);
                i--;

            }
            i++;
            p = false;
            l = false;

        }
        return list;
    }
}