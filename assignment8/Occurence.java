import java.util.Scanner;

public class Occurence {

    public static int substr(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int index, count=0, i, j;
        index = len2==0 ? 0 : -1;
        if(len1<len2)
            return -1;
        else if(index==0) {
            return index;
        }
        else {
            for(i=0;i<len1;i++) {
                if(s2.charAt(0)==s1.charAt(i)) {
                    for(j=1;j<len2;j++) {
                        if(!(s2.charAt(j)==s1.charAt(i+j)))
                            break;
                    }
                    if(j==len2)
                    {
                        index = i;
                        break;
                    }
                }
            }
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s1 = sc.nextLine();
        System.out.println("Enter a substring");
        String s2 = sc.nextLine();
        int index =  substr(s1, s2);
        if(index!=-1)
            System.out.println("Occurence Found at index " + index);
        else
            System.out.println("No Occurence Found"); 
    }
}