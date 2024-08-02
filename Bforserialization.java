import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Bforserialization implements Serializable{

int id;
String s;
Bforserialization(int id,String s)
{
    this.id=id;
    this.s=s;
}

    public static void main(String[] args) throws IOException {
        Bforserialization obj1=new Bforserialization(1,"kjgfh");
        Bforserialization obj2=new Bforserialization(2,"krytt");
       FileOutputStream f=new FileOutputStream("/home/miracle/Documents/Chandini/new.txt");
       ObjectOutputStream ob=new ObjectOutputStream(f);
       ob.writeObject(obj1);
       ob.writeObject(obj2);
       ob.flush();
       ob.close();

       f.close();
    }
}
