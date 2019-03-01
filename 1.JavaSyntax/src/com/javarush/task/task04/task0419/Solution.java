package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStreamReader sReader = new InputStreamReader(System.in);
        BufferedReader bReader = new BufferedReader(sReader);
        int a1 = Integer.valueOf(bReader.readLine());
        int a2 = Integer.valueOf(bReader.readLine());
        int a3 = Integer.valueOf(bReader.readLine());
        int a4 = Integer.valueOf(bReader.readLine());
        ArrayList<Integer> A = new ArrayList<>();
        A.add(a1);
        A.add(a2);
        A.add(a3);
        A.add(a4);

        // Сортируем список
        for (int i = 0; i < A.size(); i++) {
            int j = i;
            while ( (j > 0) && (A.get(j) < A.get(j - 1))) {

                int a = A.get(j);
                int b = A.get(j - 1);
                int z = a;

                a = b;
                b = z;

                A.set(j, a);
                A.set(j - 1, b);
                j -= 1;
            }
        }

        a1 = Integer.valueOf(A.get(0));
        a2 = Integer.valueOf(A.get(1));
        a3 = Integer.valueOf(A.get(2));
        a4 = Integer.valueOf(A.get(3));

        if (a4 != a3) System.out.println(a4);

            // все равны
        else if ((a4 == a3) && (a3 == a2) && (a2 == a1)) System.out.println(a4);

            // 3 равны
        else if ((a4 == a3) && (a3 == a2)) System.out.println(a4);
        else if ((a4 == a2) && (a2 == a1)) System.out.println(a4);
        else if ((a4 == a3) && (a3 == a1)) System.out.println(a4);
        else if ((a3 == a2) && (a2 == a1)) System.out.println(a3);

            // 2 равны
        else if (a4 == a3) System.out.println(a4);
        else if (a4 == a2) System.out.println(a4);
        else if (a4 == a1) System.out.println(a4);

        else if (a3 == a2) System.out.println(a3);
        else if (a3 == a1) System.out.println(a3);

        else if (a2 == a1) System.out.println(a2);
    }

}
