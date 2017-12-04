package ru.ruru.education;

class Dog extends Animal {

    int balls; //колличество сгрызанных мячей

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void voice() {
        System.out.println("Собака по кличке " + this.name + " лает: Гав-Гав!");
    }
}
