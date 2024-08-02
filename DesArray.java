
    

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DesArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f=new FileInputStream("/home/miracle/Documents/Chandini/f2.txt");
        ObjectInputStream obj=new ObjectInputStream(f);
        while(obj!=null)
        {
            SerialArray s1=(SerialArray)obj.readObject();
            System.out.println(s1.id+" "+s1.s);
        }
        

    }
}
