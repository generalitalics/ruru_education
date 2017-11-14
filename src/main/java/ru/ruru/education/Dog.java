package ru.ruru.education;

class Dog extends Animal {

    int balls; //колличество сгрызанных мячей

    public void voice() {
        System.out.println("Собака по кличке " + this.name + " лает: Гав-Гав!");
    }
}
