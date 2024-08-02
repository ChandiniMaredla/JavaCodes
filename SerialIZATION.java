import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerialIZATION implements Serializable{
    int id;
    String n;
    SerialIZATION(int id,String n)
    {
this.id=id;
this.n=n;
    }
    public static void main(String[] args) throws IOException {
        SerialIZATION obj1=new SerialIZATION(1,"asd");
        SerialIZATION obj2=new SerialIZATION(2,"hhg");
        
         FileOutputStream fout=new FileOutputStream("/home/miracle/Documents/Chandini/f1.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);
  ArrayList<SerialIZATION> list=new ArrayList<>();
  list.add(obj1);
  list.add(obj2);
  out.writeObject(list);
 
  out.flush();
  out.close();    

    }
}
