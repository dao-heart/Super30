import java.util.Scanner;
public class Assignment3 {

	public static double addNumbers(double num1, double num2) {
		return num1+num2;
	}
	public static double biggest(double num1, double num2, double num3) {
		double max = num1;
		if(num2>max)
			max=num2;
		if(num3>max)
			max=num3;
		return max;
	}
	public static String leapYear(int n) {
		String s; 
		if((n%4==0 && n%100!=0) || n%400==0)
			s="Leap Year";
		else
			s="Not a Leap Year";
		return s;	
	}
	public static void pattern(int n) {
		int i, j;
		System.out.println();
		for(i = 1; i <= n; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static int palindrome(int n) {
		int R = 0;
		int temp = n;
		while(n!=0)
		{
			R=R*10+n%10;
			n/=10;
		}
		if(temp==R)
			return 1;
		else
			return 0;
	}
	public static int prime(int n) {
		int i;
		int flag=1;
		for(i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=0;
				break;
			}
		}
		if(flag==1||n==1)
			return 1;
		else
			return 0;
	}
	public static int reverse(int n) {
		int R = 0;
		while(n!=0)
		{
			R=R*10+n%10;
			n/=10;
		}
		return R;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers you want to add");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		System.out.println("Addition is "+ addNumbers(n1,n2));


		System.out.println("Enter three numbers to find biggest");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		System.out.println("Biggest is "+ biggest(n1,n2,n3));


		System.out.println("Enter a year");
		int N = sc.nextInt();
		System.out.println(leapYear(N));


		System.out.println("Enter rows for pattern");
		N = sc.nextInt();
		pattern(N);


		System.out.println("Enter a number to check Palindrome");
		N = sc.nextInt();
		if(palindrome(N)==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");


		System.out.println("Enter a number to check Prime");
		N = sc.nextInt();
		if(prime(N)==1)
			System.out.println("Prime");
		else
			System.out.println("Not a Prime");


		System.out.println("Enter a number to find reverse");
		N = sc.nextInt();
		System.out.println("Reverse is " +reverse(N));

	}
}