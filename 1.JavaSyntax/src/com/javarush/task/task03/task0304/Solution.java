package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double z = i *1.0;
        double tenPersent = (z / 100) * 10;
        return i + tenPersent;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
