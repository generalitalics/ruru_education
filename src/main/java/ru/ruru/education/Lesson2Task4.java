package ru.ruru.education;

public class Lesson2Task4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Man man = new Man();
        Woman woman = new Woman();

        dog.age = 7;
        dog.name = "Шарик";
        dog.lnTail = 22;

        cat.age = 6;
        cat.name = "Шнурок";
        cat.lnTail = 22;

        man.name = "Вейдер";
        man.age = 46;
        man.javaLvl = 3;

        woman.name = "Лея";
        woman.age = 49;
        woman.javaLvl = 4;

        System.out.println(cat.lnTail + cat.age);
        cat.voice();
        cat.getAge();
        cat.eat();
        dog.voice();
    }
}
