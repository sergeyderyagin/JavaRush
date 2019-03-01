package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> berries = new HashMap<>();

        berries.put("арбуз", "ягода");
        berries.put("банан", "трава");
        berries.put("вишня", "ягода");
        berries.put("груша", "фрукт");
        berries.put("дыня", "овощ");
        berries.put("ежевика", "куст");
        berries.put("жень-шень", "корень");
        berries.put("земляника", "ягода");
        berries.put("ирис", "цветок");
        berries.put("картофель", "клубень");

        for (String key : berries.keySet()) {
            System.out.println(key + " - " + berries.get(key));
        }

    }
}
