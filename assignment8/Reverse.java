import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        String rev = new String();
        System.out.println("Enter a string to get the reverse");
        str = sc.nextLine();
        int i=0;
        int len=str.length();
        while(i<len) {
            rev += str.charAt(len-1-i);
            i++;
        }
        System.out.println("Reversed String");
        System.out.println(rev);
    }
}