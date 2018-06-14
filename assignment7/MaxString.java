import java.util.Scanner;
import java.lang.Integer;
import java.lang.String;

public class MaxString {
    String str1;
    String str2;
    void input(String s1, String s2) {
        str1 = s1;
        str2 = s2;
    }
    void findMax() {
        int i1, i2;
        i1 = Integer.parseInt(str1);
        i2 = Integer.parseInt(str2);
        if(i1>i2)
            System.out.println(str1 + " is greater");
        else if(i2>i1)
            System.out.println(str2 + " is greater");
        else
            System.out.println("Both numbers are equal");
    }
    public static void main(String[] args) {
        MaxString m = new MaxString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        m.input(s1,s2);
        m.findMax();
    }
}