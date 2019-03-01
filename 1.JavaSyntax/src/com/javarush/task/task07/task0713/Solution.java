package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> allItemList = new ArrayList<>();
        ArrayList<Integer> devide3List = new ArrayList<>();
        ArrayList<Integer> devide2List = new ArrayList<>();
        ArrayList<Integer> allTheRestList = new ArrayList<>();


        for (int i = 0; i < 20; i++) {
            allItemList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < allItemList.size(); i++) {
            if (allItemList.get(i) % 3 == 0) {
                devide3List.add(allItemList.get(i));
            }
            if (allItemList.get(i) % 2 == 0) {
                devide2List.add(allItemList.get(i));
            }
            if (allItemList.get(i) % 3 != 0 && allItemList.get(i) % 2 != 0) allTheRestList.add(allItemList.get(i));
        }


        printList(devide3List);
        printList(devide2List);
        printList(allTheRestList);

    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
