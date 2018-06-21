import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class CompareSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements for first set");
        int n1 = sc.nextInt();
        Set<Integer> set1 = new HashSet<>(n1);
        System.out.println("Enter elements for first set");
        for(int i=0;i<n1;i++) {
            int n = sc.nextInt();
            set1.add(n);
        }
        System.out.println("Enter no. of elements for second set");
        int n2 = sc.nextInt();
        Set<Integer> set2 = new HashSet<>(n2);
        System.out.println("Enter elements for second set");
        for(int i=0;i<n2;i++) {
            int n = sc.nextInt();
            set2.add(n);
        }
        
        int temp, flag;
        ArrayList<Integer> list = new ArrayList<>();
        Iterator<Integer> i1 = set1.iterator();
        while(i1.hasNext()) {
            flag=1;
            temp=i1.next();
            Iterator<Integer> i2 = set2.iterator();
            while(i2.hasNext()) {
                if(temp==i2.next()){
                    flag=0;
                }
            }
            if(flag==1) {
                list.add(temp);
            }

        }
        for(Integer l: list) {
            set1.remove(l);
            set2.remove(l);
        }
        Iterator<Integer> itr2 = set2.iterator();
        while(itr2.hasNext()) {
            flag=1;
            temp=itr2.next();
            Iterator<Integer> itr1 = set1.iterator();
            while(itr1.hasNext()) {
                if(temp==itr1.next()){
                    flag=0;
                }
            }
            if(flag==1) {
                list.add(temp);
            }

        }
        for(Integer l: list) {
            set1.remove(l);
            set2.remove(l);
        }
        System.out.println("Elements in the sets after comparison");
        System.out.print("Set1: ");
        for(Integer s: set1) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.print("Set2: ");
        for(Integer s: set2) {
            System.out.print(s+" ");
        }
    }
}