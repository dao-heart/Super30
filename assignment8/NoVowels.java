import java.util.Scanner;
import java.lang.String;
import java.lang.StringBuffer;

public class NoVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        String newStr = new String();
        System.out.println("Enter a string to remove the vowels");
        str = sc.nextLine();
        int i=0;
        int len=str.length();
        while(i<len) {
            if(str.charAt(i)!='a'&&str.charAt(i)!='e'&&str.charAt(i)!='i'&&str.charAt(i)!='o'&&str.charAt(i)!='u')
                newStr  += str.charAt(i);
            i++;
        }
        System.out.println("No Vowel String");
        System.out.println(newStr);
    }
}