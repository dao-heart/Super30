import java.util.Scanner;
import java.lang.String;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter a string to print out its substrings");
        str = sc.nextLine();
        int i,j,k;
        int len=str.length();
        for(i=0;i<len;i++) {
            for(j=i;j<len;j++) {
                for(k=i;k<=j;k++) {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}