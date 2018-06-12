import java.util.Scanner;

public class Complex {
    int real;
    int imaginary;
    public Complex() {
        this.real = this.imaginary=0;
    }
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void Display() {
        if(imaginary<0)
            System.out.println(real+""+imaginary+"i");
        else
            System.out.println(real+"+"+imaginary+"i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part");
        int r = sc.nextInt();
        System.out.println("Enter imaginary part");
        int i = sc.nextInt();
        Complex c = new Complex(r,i);
        c.Display();
    }
}