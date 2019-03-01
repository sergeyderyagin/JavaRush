package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {

    private int weight = 10;
    private int age = 5;
    private String color;
    private String name;
    private String address;


    public void initialize(String newName) {
        name = newName;
        color = "green";
        weight = 11;
        age = 23;

    }
    public void initialize(String newName, int newWeight, int newAge) {
        name = newName;
        weight = newWeight;
        age = newAge;
        color = "blue";
    }

    public void initialize(String newName, int newAge) {
        name = newName;
        age = newAge;
        weight = 3;
        color = "safds";
    }

    public void initialize(int newWeight, String newColor) {
        weight = newWeight;
        color = newColor;
        age = 2;
    }

    public void initialize(int newWeight, String newColor, String newAddress) {
        weight = newWeight;
        color = newColor;
        address = newAddress;
        age = 234;
    }


    public static void main(String[] args) {
    }
}
