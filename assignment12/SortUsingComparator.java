import java.util.*;
import java.lang.*;

public class SortUsingComparator {

    public static void main(String[] args) {
        ArrayList<People> list = new ArrayList<>();
        list.add(new People(10, "Rahul"));
        list.add(new People(20, "Rayan"));
        list.add(new People(30, "Aryan"));
        list.add(new People(14, "Ria"));
        list.add(new People(20, "Shruti"));
        Collections.sort(list);
        for(People l: list) {
            System.out.println(l.getAge()+" --->  "+l.getName());
        }
    }
}

class People implements Comparable<People> {
    int age;
    String name;
    People(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public static int compareStrings(String s1, String s2) {
        int R=0;
        for(int i=0;i<s1.length()&&i<s2.length();i++) {
            if(s1.charAt(i)>s2.charAt(i)) {
                    R=1;
                    break;
            }
            else if(s1.charAt(i)<s2.charAt(i)) {
                R=-1;
                break;
            }
        }
        if(R==0) {
            if(s1.length()>s2.length())
                R=1;
            else if(s1.length()<s2.length())
                R=-1;
        }
        return R;
    }
    public int compareTo(People p) {
        if(this.age>p.age) { return 1;}
        else if(this.age<p.age) { return -1; }
        else {
            return compareStrings(this.name, p.name);
        }
    } 
}