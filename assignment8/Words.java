import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0, i;
        int len = s.length();
        if(len!=0&&s.charAt(0)!=' ')
            count++;
        for(i=1;i<len;i++) {
            if(s.charAt(i-1)==' '&&s.charAt(i)!=' ')
                count++;
        }
        System.out.println("Total number of words are " + count);
    }
}