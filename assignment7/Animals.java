interface Animals {
    void speak();
    void eat();
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.speak();
        d.eat();
        c.speak();
        c.eat();
    }
}
class Dog implements Animals {
    public void speak() {
        System.out.println("Dogs bark");
    }
    public void eat() {
        System.out.println("Dogs love biscuits");
    }
} 
class Cat implements Animals {
    public void speak() {
        System.out.println("Cats Meow");
    }
    public void eat() {
        System.out.println("Cats love milk");
    }
}