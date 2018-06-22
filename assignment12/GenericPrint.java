import java.util.Scanner;
import java.lang.Number;

public class GenericPrint {

    public static<DT> void print(DT arr[]) {
        int i, size = arr.length;
        for(i=0;i<size;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
		Double DoubleArr[] = {1.0,5.0,2.0,6.0,0.0};
        System.out.println("Double Array");
        print(DoubleArr);

		Integer IntArr[] = {5,1,8,2,0,10,-1,23};
        System.out.println("\nInteger Array");
        print(IntArr);
    }
}