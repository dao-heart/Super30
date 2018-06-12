import java.util.Scanner;

public class Rectangle {
    double l;
    double b;
    double a;
    public Rectangle() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        this.l = sc.nextDouble();
        this.b = sc.nextDouble();
    }
    public void ComputeArea() {
        a = l*b;
    }
    public void Display() {
        System.out.println("Area is "+a+" units");
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.ComputeArea();
        rect.Display();
    }
}