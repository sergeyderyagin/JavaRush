package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfather1 = new Human("grandfather1", true, 100);
        Human grandfather2 = new Human("grandfather2", true, 200);

        Human grandmother1 = new Human("grandmother1", false, 95);
        Human grandmother2 = new Human("grandmother2", false, 195);

        Human father = new Human("father", true, 50, grandfather1, grandmother1);
        Human mother = new Human("mother", false, 50, grandfather2, grandmother2);

        Human child1 = new Human("child1", false, 10, father, mother);
        Human child2 = new Human("child2", true, 20, father, mother);
        Human child3 = new Human("child3", true, 30, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandfather2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father = null;
        Human mother = null;

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}