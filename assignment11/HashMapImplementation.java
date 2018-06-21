import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> studentList = new HashMap<>();
        System.out.println("Enter number of students");
        int N = sc.nextInt();
        int key;
        String value="";
        System.out.println("Enter rollno and name in this pattern <Rollno> <Space> <Student>");
        for(int i=0;i<N;i++) {
            key = sc.nextInt();
            value = sc.nextLine();
            studentList.put(key,value);
        }
        System.out.println("Rollno -----> StudentName\n");
        for(Map.Entry<Integer, String> e: studentList.entrySet()) {
            System.out.print("  "+e.getKey()+"    ----->"+e.getValue()+"\n");
        }
    }
}