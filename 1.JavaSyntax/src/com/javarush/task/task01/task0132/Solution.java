package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String x = String.valueOf(number);
        int a = Integer.valueOf(x.substring(0, 1));
        int b = Integer.valueOf(x.substring(1, 2));
        int c = Integer.valueOf(x.substring(2, 3));
        return a + b + c;
    }
}