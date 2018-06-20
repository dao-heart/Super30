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
            ArrayList<String> paths = new ArrayList<>(2);
            paths.add("D:/CN");
            paths.add("D:/CST");
            for(String path: paths) {
                List(path);
            }
            
            File fout = new File("Output.csv");
            FileOutputStream Output = new FileOutputStream(fout);
            ArrayList<String> FileNames = new ArrayList<String>(size);
            String temp = "";
            for(int j=0;j<size;j++) {
                for(int k=Files.get(j).length()-1;k>=0;k--)
                {
                    if(Files.get(j).charAt(k)=='/') {
                        temp="";
                        for(int m=k+1;m<Files.get(j).length();m++) {
                            temp += Files.get(j).charAt(m);
                        }
                        FileNames.add(""+temp);
                        break;
                    }
                }
            }
            System.out.println("All files in the given paths");
            ArrayList<String> Csv = new ArrayList<String>(size+1);
            Csv.add("FILENAMES, FILEPATHS\n\n");
            for(int j=0;j<size;j++) {
                Csv.add(""+FileNames.get(j)+", "+Files.get(j));
            }
            for(String fp: Csv) {
                System.out.println(fp);
            }
            int j=0,k=0;
            char c;
            while(j<size) {
                c = Csv.get(j).charAt(k);
                Output.write(c);
                k++;
                if(k==Csv.get(j).length()) {
                    j++;
                    k=0;
                    Output.write('\n');
                }
            }
        }
        catch(Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
} 