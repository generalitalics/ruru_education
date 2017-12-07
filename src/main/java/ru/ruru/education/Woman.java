package ru.ruru.education;

class Woman extends Human {

    private Dog dog;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Woman woman = new Woman("Lara",33);
        Dog dog = new Dog("Laika",7);
        woman.setDog(dog);
        woman.dog.voice();
    }

}
