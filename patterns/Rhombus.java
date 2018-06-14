import java.util.Scanner;

class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==1)
            System.out.println("Number should be even");
        int i,j,k=0;
        for(i=1;i<n;i++) {
            for(j=1;j<=n;j++) {
                if(j>(n/2-k)&&j<=(n/2+k))
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            if(i<n/2)
                k++;
            else
                k--;
            System.out.println();
        }
    }
}