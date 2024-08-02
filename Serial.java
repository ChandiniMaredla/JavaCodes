import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Serial implements Serializable{

int id;
String s;
Serial(int id,String s)
{
    this.id=id;
    this.s=s;
}

    public static void main(String[] args) throws IOException {
        Serial obj1=new Serial(1,"kjgfh");
        Serial obj2=new Serial(2,"krytt");
       FileOutputStream f=new FileOutputStream("/home/miracle/f2.txt");
       ObjectOutputStream ob=new ObjectOutputStream(f);
       ob.writeObject(obj1);
       ob.writeObject(obj2);
       ob.flush();
    //    ob.close();

    //    f.close();
    }
}
