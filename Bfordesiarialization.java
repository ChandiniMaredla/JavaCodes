import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Bfordesiarialization {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fi=new FileInputStream("/home/miracle/Documents/Chandini/new.txt");
    ObjectInputStream obs = new ObjectInputStream(fi);
            while(true)
            {
            Bforserialization obj=(Bforserialization)obs.readObject();
            System.out.println(obj.id+" "+obj.s);
            }
}
    }