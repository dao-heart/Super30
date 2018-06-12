import java.util.Scanner;

class SecondMax {
    int size;
    int arr[];
    public SecondMax(int arr[]) {
        this.size = arr.length;
        this.arr = new int[this.size];
        this.arr = arr;
    }
    public int maxElem() {
        int max=arr[0], smax=arr[0], i;
        for(i=1;i<size;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            else
                smax=arr[i];
        }
        for(i=0;i<arr.length;i++)
        {
            if(smax<arr[i]&&arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int i;
        System.out.println("Enter array elements");
        for(i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        SecondMax sm = new SecondMax(arr);
        System.out.println("Second max element is "+ sm.maxElem());
    }
}