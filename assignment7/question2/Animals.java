public abstract class Animals {
    String breed;
    String color;
    String name;
    public abstract void eat();
    public void speak() {
        System.out.println("Animals communicate");
    }
    public static void main(String[] args) {
        Animals a = new Dog();
        a.speak();
        a.eat();
    }
}

class Dog extends Animals {
    public Dog() {
        breed = "Pug";
        color = "Brown";
        name = "Aron";
    }
    public void speak() {
        System.out.println(name + " bark");
    }
    public void eat() {
        System.out.println(name + " love biscuits");
    }
}