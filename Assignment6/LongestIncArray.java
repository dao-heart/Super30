import java.util.Scanner;
import java.util.Arrays;

import com.sun.javafx.iio.ImageFrame;

public class LongestIncArray {

    public static int[] subArray(int arr[]) {
        int i, j, size=arr.length;
        int start=0, end=0, fstart=0, fend=0;
        int len=0, count=0;
        for(i=0;i<size-1;i++) {
            if(arr[i]<arr[i+1])
            {
                if(count==0)
                {
                    start=i;
                }
                count++;
                if(i==size-2&&count>len)
                {
                    fstart=start;
                    fend=i+1;
                    len=count;
                }
            }
            else
            {
                if(count!=0)
                {
                    end=i;
                    if(count>len)
                    {
                        len=count;
                        fstart = start;
                        fend = end;
                    }
                }
                count=0;
            }
        }
        int subArr[] = new int[len+1];
        j=0;
        for(i=fstart;i<=fend;i++) {
            subArr[j]=arr[i];
            j++;
        }
        return subArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements");
        int i;
        for(i=0;i<size;i++)
            arr[i] = sc.nextInt();

        int subArr[] = subArray(arr);
        System.out.println("Length of the Longest Increasing SubArray is " + subArr.length);
        System.out.println();
        System.out.println("And the Longest Increasing SubArray is ");
        System.out.println(Arrays.toString(subArr));
    }
}