import java.util.Scanner;
import java.util.Arrays;

public class SortImproved {
    public static int[] sort(int arr[]) {
        int size=arr.length;
        int left = 0, right = size-1;
        while(left!=right&&left!=(size-1)&&right!=0)
        {
            if(arr[left]<arr[right])
            {   if(arr[left]==0) 
                {
                    left++;
                    if(left==right)
                        break;
                }
                if(arr[right]==1)
                    right--;
            }
            else
            {
                arr[left]=0;
                arr[right]=1;
                left++;
                if(left==right)
                    break;
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the array consisting 0's and 1's");
        int sortArr[] = new int[size];
        int i;
        for(i=0;i<size;i++) 
        {
            sortArr[i]=sc.nextInt();
        }
        sortArr = sort(sortArr);
        System.out.println("Sorted Array: " + Arrays.toString(sortArr));
    }
}