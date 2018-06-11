import java.util.Scanner;

public class DynamicArray {

    int arr[] = new int[10000];
    int index;
    public DynamicArray() {
        index=0;
    }
    public void add(int elem) {
        this.arr[index]=elem;
        this.index++;
    }
    public int size() {
        return index;
    }
    public void set(int index, int elem) {
        if(index>this.index||index<0)
            System.out.println("Index out of Bound");
        else
            this.arr[index] = elem;
    }
    public int get(int index) {
        return arr[index];
    }
    public void remove() {
        this.arr[index]=0;
        this.index--;
    }
    public void display() {
        int i;
        for(i=0;i<this.index;i++) {
            System.out.print(this.arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DynamicArray da= new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(4);
        da.set(4,3);
        da.display();
        da.remove();
        da.display();
        System.out.println("Elem at 1 is "+da.get(1));
        System.out.println("Size is "+da.size());
    }
}