package com.javarush.task.task08.task0801;

/* 
HashSet из растений
*/

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> stringSet = new HashSet<String>();

        stringSet.add("арбуз");
        stringSet.add("банан");
        stringSet.add("вишня");
        stringSet.add("груша");
        stringSet.add("дыня");
        stringSet.add("ежевика");
        stringSet.add("женьшень");
        stringSet.add("земляника");
        stringSet.add("ирис");
        stringSet.add("картофель");

        for (String s : stringSet) {
            System.out.println(s);
        }


    }
}
