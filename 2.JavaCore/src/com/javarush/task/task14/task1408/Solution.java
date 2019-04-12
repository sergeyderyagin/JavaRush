package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            //напишите тут ваш код
            return hen;
        }
    }

    public abstract class Hen {
        public abstract int getCountOfEggsPerMonth();

        public String getDescription() {
            return "Я - курица.";
        }
    }

    public class RussianHen extends Hen {
        public int getCountOfEggsPerMonth() {
            return 0;
        }

        @Override
        public String getDescription() {
            return "Я курица, несущая 1 яйцо.";
        }
    }

    public class UkrainianHen extends Hen {
        public int getCountOfEggsPerMonth() {
            return 1;
        }

        @Override
        public String getDescription() {
            return "Я курица, несущая 2 яйца.";
        }
    }

    public class MoldovanHen extends Hen {
        public int getCountOfEggsPerMonth() {
            return 2;
        }

        @Override
        public String getDescription() {
            return "Я курица, несущая 3 яйца.";
        }
    }
    public class BelarusianHen extends Hen {
        public int getCountOfEggsPerMonth() {
            return 3;
        }

        @Override
        public String getDescription() {
            return "Я курица, несущая 4 яйца.";
        }
    }

}
