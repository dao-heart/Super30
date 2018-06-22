import java.util.Scanner;
import java.lang.Number;

public class GenericSort {

    public static<DT extends Comparable<DT>> DT[] sort(DT arr[]) {
        int i,j,loc,size = arr.length;
        for(i=0;i<size;i++)
		{
			loc=i;
			for(j=i-1;j>=0;j--)
			{
				if(arr[i].compareTo(arr[j])==-1)
				{
					DT temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i--;
				}
				else
					break;
			}
			i=loc;
        }
        return arr;
    }

    public static void main(String[] args) {
		Double unsortedDoubleArr[] = {1.0,5.0,2.0,6.0,0.0};
		Double sortedDoubleArr[] = sort(unsortedDoubleArr);
		System.out.println("Double Array");
		for(int i=0;i<sortedDoubleArr.length;i++) {
			System.out.print(sortedDoubleArr[i]+" ");
		}
		Integer unsortedIntArr[] = {5,1,8,2,0,10,-1,23};
		Integer sortedIntArr[] = sort(unsortedIntArr);
		System.out.println("\nInteger Array");
		for(int i=0;i<sortedIntArr.length;i++) {
			System.out.print(sortedIntArr[i]+" ");
		}
    }
}