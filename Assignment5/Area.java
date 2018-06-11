import java.util.Scanner;

public class Area {
    double l;
    double b;
    double a;
    public Area() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter length and breadth");
        this.l = sc.nextDouble();
        this.b = sc.nextDouble();
    }
    public void computeArea() {
        a = l*b;
    }
    public void display() {
        System.out.println("Area is "+a+" units");
    }

    public static void main(String[] args) {
        Area rect = new Area();
        rect.computeArea();
        rect.display();
    }
}