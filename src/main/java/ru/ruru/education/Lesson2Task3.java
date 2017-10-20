package ru.ruru.education;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2Task3 {
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
        System.out.print("введите 3-е число: ");
        int w = Integer.parseInt(bufferedReader.readLine());
        System.out.print("введите 4-е число: ");
        int z = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Минимальное из 4х чисел: " + minTwo(minTwo(x,y),minTwo(w,z)));
    }
}
