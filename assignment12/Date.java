import java.util.HashMap;
import java.util.Scanner;
import java.lang.Character;
import java.lang.String;

import javax.print.DocFlavor.STRING;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> words = new HashMap<>();
        words.put('/',"/");
        words.put('0',"zero");
        words.put('1',"One");
        words.put('2',"Two");
        words.put('3',"Three");
        words.put('4',"Four");
        words.put('5',"Five");
        words.put('6',"Six");
        words.put('7',"Seven");
        words.put('8',"Eight");
        words.put('9',"Nine");
        System.out.println("Enter the date in <dd/mm/yy> format");
        String date = sc.nextLine();
        for(int i=0;i<date.length();i++) {
            System.out.print(words.get(date.charAt(i)));
        }
    }
}