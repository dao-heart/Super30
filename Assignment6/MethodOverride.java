class Animal {
    public String breed;
    public String color;
    public Animal(String breed, String color) {
        this.breed = breed;
        this.color = color;
        System.out.println("Animal Class's constructor called");
    }
    public void speak() {
        System.out.println("Animals Communicate");
    }
}

class Dog extends Animal {
    public Dog(String breed, String color) {
        super(breed,color);
        System.out.println("Dog Class's constructor called");
    }
    @Override
    public void speak() {
        System.out.println("Dogs bark");
    }
}

class Cat extends Animal {
    public Cat(String breed, String color) {
        super(breed,color);
        System.out.println("Cat Class's constructor called");
    }
    @Override
    public void speak() {
        System.out.println("Cats meow");
    }
}

public class MethodOverride {

    public static void main(String[] args) {
        Animal d = new Dog("Pug","Brown");   //Method Overiding
        Animal c = new Cat("Persian","White");
        System.out.println();
        System.out.println("Breed of Dog is " + d.breed);
        System.out.println("Color of Dog is " + d.color);
        System.out.println("Breed of Cat is " + c.breed);
        System.out.println("Color of Cat is " + c.color);
        d.speak();
        c.speak();
    }
}