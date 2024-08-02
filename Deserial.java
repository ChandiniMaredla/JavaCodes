import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        FileInputStream fi=new FileInputStream("/home/miracle/f2.txt");
    try (ObjectInputStream obs = new ObjectInputStream(fi)) {
        while(obs!=null)
        {
        Serial obj=(Serial)obs.readObject();
        System.out.println(obj.id+" "+obj.s);
        }
    }
}
    }