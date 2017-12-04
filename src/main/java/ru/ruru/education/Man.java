package ru.ruru.education;

class Man extends Human {

    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Man man = new Man("Дэн", 30);
        Cat cat = new Cat("Мурка",11);
        cat.glasses = 5;
        System.out.println("Кошка по кличке " + cat.name + " разбила уже " + cat.glasses + " стаканов. " + man.name + " недоволен.");
        System.out.println(man.name + "у уже " + man.age + " лет. И он все еще живет с " + cat.age + "-летней кошкой");

    }
}
