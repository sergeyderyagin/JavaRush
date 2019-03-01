package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg z1 = new Zerg();
        Zerg z2 = new Zerg();
        Zerg z3 = new Zerg();
        Zerg z4 = new Zerg();
        Zerg z5 = new Zerg();

        Protoss p1 = new Protoss();
        Protoss p2 = new Protoss();
        Protoss p3 = new Protoss();

        Terran t1 = new Terran();
        Terran t2 = new Terran();
        Terran t3 = new Terran();
        Terran t4 = new Terran();

        z1.name = "a";
        z2.name = "b";
        z3.name = "c";
        z4.name = "d";
        z5.name = "e";

        p1.name = "f";
        p2.name = "g";
        p3.name = "h";

        t1.name = "i";
        t2.name = "j";
        t3.name = "k";
        t4.name = "l";








    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
