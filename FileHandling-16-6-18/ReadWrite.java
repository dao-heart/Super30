import java.io.*;
import java.lang.String;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        File f = new File("abc.txt");
        f.createNewFile();
        FileInputStream in = new FileInputStream(f);
        FileOutputStream out = new FileOutputStream(f);
        try {
            System.out.println("How many paths you wish to enter");
            int n = sc.nextInt();
            n++;
            String s[] = new String[n];
            System.out.println("Enter the paths");
            for(int i=0;i<n;i++) {
                s[i] = sc.nextLine();
            }
            for(int i=0;i<n;i++) {
                for(int j=0;j<s[i].length();j++) {
                    out.write(s[i].charAt(j));
                }
                out.write('\n');
            }
            int c;
            while((c=in.read())!=-1) {
                System.out.print((char)c);
            }
        }
        catch(Exception e) {
            System.out.println("Exception thrown: " + e);
        }
        finally {
            in.close();
            out.close();
        }
    }
}