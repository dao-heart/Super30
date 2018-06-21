/*Implementing Stack using static array*/
/*Functions - pop(), push(), peek(), search(), size(), empty()*/

import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Integer;
import java.util.EmptyStackException;

public class StackImplementation<X> {
    static int size=8;
    X arr[] = (X[])new Object[size];
    int index;
    public StackImplementation() {
        index=0;
    }
    public void push(X elem) {
        if(index==size)
        {
            int tempSize = size;
            size+=size/2;
            X tempArr[] = (X[])new Object[size];
            for(int i=0;i<tempSize;i++)
                tempArr[i]=arr[i];
            this.arr=tempArr;
            this.arr[index] = elem;
            this.index++;
        }
        else
        {
            this.arr[index]=elem;
            this.index++;
        }
    }
    public X pop() throws EmptyStackException {
        X last;
        try {
            this.index--;
            last = arr[index];
            this.arr[index]=null;
            return last;
        }
        catch(Exception e) {
            System.out.println("Exception Occurred: " + e);
        }
        return null;
    }
    public X peek() throws ArrayIndexOutOfBoundsException {
        try {
            X last = arr[index-1];
            return last;
        }
        catch(Exception e) {
            System.out.println("Exception Occurred: " + e);
        }
        return null;
    }
    public int search(X elem) {
        if(this.index!=0) {
            int i=-1;
            for(i=this.index-1;i>=0;i--) {
                if(arr[i]==elem) {
                    break;
                }
            }
            if(i!=-1)
                return this.index-i-1;
            else
                return -1;
        }
        else
            return -1;
    }
    public int size() {
        return index;
    }
    public int capacity() {
        return size;
    }
    public boolean empty() {
        if(index==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        StackImplementation<Double> stack= new StackImplementation<Double>();
        System.out.println("Stack Capacity: " + stack.capacity());
        Double a=4.1;
        stack.push(1.0);
        stack.push(2.0);
        stack.push(a);
        stack.push(5.0);
        stack.push(4.0);
        stack.push(7.0);
        stack.push(8.0);
        stack.push(9.0);
        stack.push(10.0);
        stack.push(11.0);
        System.out.println("Element on the top of the stack: " + stack.peek());
        System.out.println("Element Found or not: " + stack.search(a));
        System.out.println("Element Found or not: " + stack.search(3.0));
        System.out.println("Stack empty or not: " + stack.empty());
        System.out.println("Stack Capacity: " + stack.capacity());
        int size = stack.size();
        System.out.println("Stack size: " + size);
        System.out.println("Elements in the stack");
        for(int i=0;i<size;i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}