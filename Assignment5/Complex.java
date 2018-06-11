import java.util.Scanner;

public class Complex {
    int real;
    int imag;
    public Complex() {
        this.real = this.imag=0;
    }
    public Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }
    public void display() {
        if(imag<0)
            System.out.println(real+""+imag+"i");
        else
            System.out.println(real+"+"+imag+"i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part");
        int r = sc.nextInt();
        System.out.println("Enter imaginary part");
        int i = sc.nextInt();
        Complex c = new Complex(r,i);
        c.display();
    }
}