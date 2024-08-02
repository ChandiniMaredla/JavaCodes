import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import javax.script.ScriptException;
public class Fileinputscanner
{
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("/home/miracle/Documents/Chandini/file.txt");
Scanner sc=new Scanner(f);
int c=0;
while(sc.hasNextLine())
{
    c++;
    System.out.print(sc.nextLine());
}
f.close();
System.out.println(c);
    }
}