package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man men = new Man("1", 2, "3");
        Woman me2n = new Woman("1", 2, "3");
        Man m2en = new Man("1", 12, "33");
        Woman m2e2n = new Woman("31", 22, "3");

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);

        }

    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);

        }

    }

}
