import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Specificlines {
    public static void main(String[] args) throws IOException {
        File f=new File("/home/miracle/Documents/Chandini/newfile.txt");
        f.createNewFile();
       Scanner sc=new Scanner(System.in);

        FileOutputStream fi=new FileOutputStream(f);
        for(int i=0;i<10;i++)
        {
            String s=sc.nextLine()+System.lineSeparator();
            
            byte b[]=s.getBytes();
fi.write(b);
        }
fi.close();

        int c=0,n=5;
        FileInputStream fins=new FileInputStream(f);
        Scanner sc1=new Scanner(fins);
      
        while(sc1.hasNextLine())
        {
            c++;
            if(c==n)
            {
                System.out.println(sc1.nextLine());
                break;
            }
        }
    fins.close();

        }
    }

