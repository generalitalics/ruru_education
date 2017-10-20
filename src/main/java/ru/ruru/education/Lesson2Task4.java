package ru.ruru.education;

public class Lesson2Task4 {
    static class Animal {
        String name; // имя
        byte age;     // возраст
        byte height; // высота в холке в см
        byte lnTail; // длина хвоста
        boolean playful; // игривость
    }
    static class Human {
        String name; // имя
        byte age;     // возраст
        byte height; // высота в см
        byte weight; // вес в кг
        boolean javaLvl; // умение програмировать на java
    }
    private static class Cat extends Animal {
        public void Info() {
            System.out.println("что-то " + name);
        }
    }
    private static class Dog extends Animal {}
    private static class Man extends Human {}
    private static class Woman extends Human {}

    public static void main(String[] args) {
        Cat barsik = new Cat();
        Dog sharik = new Dog();
        Man vader = new Man();
        Woman leia = new Woman();
        barsik.age = 12;
        barsik.lnTail = 22;
        System.out.println(barsik.lnTail + barsik.age);

    }
}
