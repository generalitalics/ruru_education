package ru.ruru.education;

class Lesson2Task4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Шнурок",12);
        Dog dog = new Dog("Шарик",7);
        Man man = new Man("Вейдер",44);
        Woman woman = new Woman("Лея",22);

        dog.lnTail = 22;
        cat.lnTail = 22;
        cat.glasses = 5;
        man.javaLvl = 3;
        woman.javaLvl = 4;

        System.out.println(cat.lnTail + cat.age);
        cat.voice();
        cat.getAge();
        cat.eat();
        System.out.println("Кошка " + cat.name + " разбила " + cat.glasses + " стаканов за свою кашачью жизнь");
        dog.voice();
    }
}
