import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Assignment4 {

	public static void pattern(int n)
	{
		int i,j;
		System.out.println();
		for(i=1;i<=n;i++)
		{
			for(j=n;j>=i;j--)
				System.out.print("*");
			System.out.println();	
		}
		System.out.println();
	}
	public static int[] even(int n) {
		int i,j=0;
		int temp = (n/2)+1;
		int arr[] = new int[temp];
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				arr[j]=i;
				j++;
			}
		}
		return arr;
	}
	public static void prime(int n) {
		int i,j,flag;
		for(i=2;i<=n;i++)
		{
			flag=1;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.print(i + " ");
		}
		System.out.println();
	}
	public static int armstrong(int n) {
		int temp = n;
		int count=0;
		while(temp!=0) {
			count++;
			temp/=10;
		}
		temp=n;
		int sum=0;
		while(temp!=0) {
			sum+=Math.pow(temp%10,count);
			temp/=10;
		}
		if(sum==n)
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

	public static double[] sort(double arr[]) {
		/*********************************************************
			To minimize computation I have used insertion sort.
			Additionally I have added a else statement which will 
			take the control out of the loop. This else statement
			will run if the element arr[i] is greater than the
			compared element arr[j]. For example the array is 
			[3,2,4,5] and after 2nd iteration of the outer loop 
			it will be [2,3,4,5] now for third iteration the if
			statement will not run because 4 is greater than 3 and
			as the array is sorted we don't need to check further
			backwards. So the control will come out of the loop
			because of the else statement and the Computation is 
			further minimized. 
		*************************************************************/
		int i,j,size = arr.length;
		int loc;
		for(i=0;i<size;i++)
		{
			loc=i;
			for(j=i-1;j>=0;j--)
			{
				if(arr[i]<arr[j])
				{
					arr[i]+=arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]-=arr[j];
					i--;
				}
				else
					break;
			}
			i=loc;
		}
		return arr;
	}
	public static int binarySearch(int arr[], int e) {
		int size=arr.length;
		int mid,first=0,last=size-1;
		mid = (first+last)/2;
		while(first<last&&arr[mid]!=e)
		{
			if(e<arr[mid])
				last = mid-1;
			else if(e>arr[mid])
				first = mid+1;
			mid = (first+last)/2;
		}
		if(arr[mid]==e)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows for pattern");
		int N = sc.nextInt();
		pattern(N);


		System.out.println("Enter number for even number range");
		N = sc.nextInt();
		int evenArr[] = new int[N];
		evenArr = even(N);
		System.out.println("Even Numbers: " + Arrays.toString(evenArr));
		System.out.println();


		System.out.println("Enter number for prime number range");
		N = sc.nextInt();
		prime(N);

		System.out.println("Enter number to check Armstrong");
		N = sc.nextInt();
		if(armstrong(N)==1)
			System.out.println("Armstrong");
		else
			System.out.println("Not Armstrong");
		System.out.println();


		System.out.println("Enter number to find reverse");
		N = sc.nextInt();
		System.out.println("Reverse is " + reverse(N));
		System.out.println();


		System.out.println("Enter size of array to sort");
		N = sc.nextInt();
		System.out.println("Enter array");
		double sortArr[] = new double[N];
		int i,j;
		for(i=0;i<N;i++)
			sortArr[i]=sc.nextDouble();
		sortArr = sort(sortArr);
		System.out.println("Sorted Array: " + Arrays.toString(sortArr));
		System.out.println();


		System.out.println("Enter size of array for Binary Search");
		N = sc.nextInt();
		System.out.println("Enter array");
		int searchArr[] = new int[N];
		for(i=0;i<N;i++)
			searchArr[i]=sc.nextInt();
		System.out.println("Enter element to search");
		int elem = sc.nextInt();
		if(binarySearch(searchArr,elem)==1)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}
}