/*Implementing Stack using static array*/
/*Functions - pop(), push(), peek(), search(), size(), empty()*/

import java.util.Scanner;
import java.util.EmptyStackException;

public class StackImplementation {
    static int size=8;
    int arr[] = new int[size];
    int index;
    public StackImplementation() {
        index=0;
    }
    public void push(int elem) {
        if(index==size)
        {
            int tempSize = size;
            size+=size/2;
            int tempArr[] = new int[size];
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
    public int pop() throws EmptyStackException {
        int last = -1;
        try {
            this.index--;
            last = arr[index];
            this.arr[index]=0;
            return last;
        }
        catch(Exception e) {
            System.out.println("Exception Occurred: " + e);
        }
        return last;
    }
    public int peek() {
        int last = arr[index-1];
        return last;
    }
    public int search(int elem) {
        if(this.index!=0) {

            /*Sorting Array elements*/
            int i,j,loc;
            int temp[] = new int[this.index];
            for(i=0;i<this.index;i++)
            {
                loc=i;
                for(j=i-1;j>=0;j--)
                {
                    if(temp[i]<temp[j])
                    {
                        temp[i]+=temp[j];
                        temp[j]=temp[i]-temp[j];
                        temp[i]-=temp[j];
                        i--;
                    }
                    else
                        break;
                }
                i=loc;
            }

            /*Using Binary Search*/
            int last=this.index-1, first=0;
            int mid = (first+last)/2;
            while(first!=last&&arr[mid]!=elem) {
                if(arr[mid]>elem)
                    last=mid-1;
                else if(arr[mid]<elem)
                    first = mid+1;
                mid = (last+first)/2;
            }
            if(arr[mid]==elem)
                return mid;
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
        StackImplementation stack= new StackImplementation();
        System.out.println("Stack Capacity: " + stack.capacity());
        stack.push(1);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        System.out.println("Element on the top of the stack: " + stack.peek());
        System.out.println("Element Found or not: " + stack.search(4));
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