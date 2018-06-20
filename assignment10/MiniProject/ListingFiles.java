import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ListingFiles {
    static ArrayList<String> Files = new ArrayList<String>(1000);
    static int size=0;

    public static void List(String path) throws NullPointerException{
       try {     
            File f = new File(path);
            String paths[] = f.list();
            if(paths!=null) {
                for(String p: paths) { 
                    String fullPath = ""+path+"/"+p;
                    List(fullPath); 
                }
            }
            else {
                Files.add(""+path); 
                size++;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        try {
            ArrayList<String> paths = new ArrayList<>(3);
            FileReader in = new FileReader("abc.txt");
            BufferedReader fin = new BufferedReader(in);
            while(fin.ready()) {
                paths.add(fin.readLine());
            }
            List(paths.get(0));
            FileWriter out = new FileWriter(paths.get(1));
            BufferedWriter fout = new BufferedWriter(out);
            String temp = "FILENAMES, FILEPATHS\n\n";
            for(int i=0;i<temp.length();i++)
                fout.write(temp.charAt(i));

            for(int j=0;j<size;j++) {
                for(int k=Files.get(j).length()-1;k>=0;k--)
                {
                    if(Files.get(j).charAt(k)=='/') {
                        temp="";
                        for(int m=k+1;m<Files.get(j).length();m++) {
                            temp += Files.get(j).charAt(m);
                        }
                        temp += ", " + Files.get(j)+"\n";
                        for(int i=0;i<temp.length();i++)
                            fout.write(temp.charAt(i));
                        break;
                    }
                }
            }
            System.out.println("FILEPATHS\n");
            for(String fp: Files)
                System.out.println(fp);
            fin.close();
            fout.flush();
            fout.close();
        }
        catch(Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
} 