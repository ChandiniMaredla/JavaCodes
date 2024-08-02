import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DEsrializarion {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream f=new FileInputStream("/home/miracle/Documents/Chandini/f1.txt");
        ObjectInputStream obj=new ObjectInputStream(f);
        while(true)
        {
            SerialIZATION s=(SerialIZATION)obj.readObject();
            System.out.println(s.id+" "+s.n);
        }
        

    }
}
