import java.util.Scanner;

class ArrayWaveform {
    int size;
    int arr[];
    public ArrayWaveform(int arr[]) {
        this.size = arr.length;
        this.arr = new int[this.size];
        this.arr = arr;
    }
    public void waveform() {
        int i;
        for(i=0;i<size-1;)
        {
            arr[i]+=arr[i+1];
            arr[i+1]=arr[i]-arr[i+1];
            arr[i]-=arr[i+1];
            i+=2;
        }
    }
    public void display() {
        int i;
        System.out.println("Array Waveform");
        for(i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
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
        ArrayWaveform aw = new ArrayWaveform(arr);
        aw.waveform();
        aw.display();
    }
}