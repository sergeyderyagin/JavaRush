package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add(0, "1");
        mylist.add(1, "2");
        mylist.add(2, "3");
        mylist.add(3, "4");
        mylist.add(4, "5");
        System.out.println(mylist.size());

        for (int i = 0; i < mylist.size(); i++) {
            mylist.get(i);
        }
    }
}
