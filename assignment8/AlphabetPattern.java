import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of alphabets you want in the pattern");
        int n = sc.nextInt();
        int i,j,k,temp,m=1;
        int upper,lower;
        int half = n%2==1 ? (n/2+1) : (n/2);
        for(i=1;i<=n/2+1;) {
            k=0;
            upper = m%2==1 ? half+i : half+i-1;
            lower = half-i+1;
            for(j=1;j<=n;j++) {
                if(j>=lower&&j<upper)
                {
                    temp = 97+k;
                    System.out.print((char)temp+"");
                    k++;
                }
                else
                    System.out.print(" ");
            }
            if(m%2==1)
                i++;
            System.out.println();
            m++;
        }
    }
}