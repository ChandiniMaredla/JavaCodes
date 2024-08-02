import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class countlines {
public static void main(String[] args) throws IOException {
    FileInputStream fi=new FileInputStream("/home/miracle/Documents/Chandini/file.txt");
    Scanner sc=new Scanner(fi);
    int c=0;
    while(sc.hasNextLine())
    {
        //System.out.println(sc.next());
        sc.nextLine();
        c++;
    }
    fi.close();
    sc.close();
    System.out.println();
    System.out.println();
    System.out.println(c);
}
}
