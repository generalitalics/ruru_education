package ru.ruru.education;

public class Cat extends Animal {

    int glasses = 0; //колличество разитых стаканов

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    void voice() {
        System.out.println("Кошка по кличке " + this.name + " мяукает: Мяу-Мяу!");
    }

    void eat() {
        System.out.println("Кошка " + this.name + " ест");
    }

    void getAge() {
        System.out.println("Кошке " + this.name + " " + this.age + " лет");
    }
}
