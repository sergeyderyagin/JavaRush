package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int newTop) {
        top = newTop;
    }

    public void initialize(int newTop, int newLeft) {
        top = newTop;
        left = newLeft;
    }

    public void initialize(int newTop, int newLeft, int newWidth) {
        top = newTop;
        left = newLeft;
        width = newWidth;
    }

    public void initialize(int newTop, int newLeft, int newWidth, int newHeight) {
        top = newTop;
        left = newLeft;
        width = newWidth;
        height = newHeight;
    }

    public static void main(String[] args) {

    }
}
