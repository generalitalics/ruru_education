package ru.ruru.education;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2Task2 {
    public static int minTwo(int a, int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Поиск минимального числа из 2х");
        System.out.print("введите 1-е число: ");
        int x = Integer.parseInt(bufferedReader.readLine());
        System.out.print("введите 2-е число: ");
        int y = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Минимальное из 2х чисел: " + minTwo(x,y));
    }
}

