import java.io.*;
import java.lang.Integer;

public class TransferContent  {

    public static void main(String[] args) throws IOException {
        try {
            FileReader f = new FileReader("abc.txt");
            FileReader f1 = new FileReader("xyz.txt");
            FileWriter f2 = new FileWriter("xyz.txt");

            BufferedReader original= new BufferedReader(f);
            BufferedReader fin= new BufferedReader(f1);
            BufferedWriter fout= new BufferedWriter(f2);

            int c;
            while((c=original.read())!=-1) {
                fout.write(c);
            }
            
            fout.flush();
            fout.close();

            while(fin.ready()) {
                System.out.println(fin.readLine());
            }
            
            fin.close();
            original.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}