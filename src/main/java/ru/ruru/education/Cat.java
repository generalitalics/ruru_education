package ru.ruru.education;

class Cat extends Animal {

    int glasses; //колличество разитых стаканов

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
