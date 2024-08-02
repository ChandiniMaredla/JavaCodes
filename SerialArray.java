import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class SerialArray implements Serializable {

    int id;
    String s;
    SerialArray(int id,String s)
    {
        this.id=id;
        this.s=s;
    }
    public static void main(String[] args) throws IOException {

        ArrayList<SerialArray> list=new ArrayList<>();
        SerialArray obj=new SerialArray(1, "dfg");
        SerialArray obj1=new SerialArray(2, "je ghb ");
        list.add(obj);
        list.add(obj1);
FileOutputStream f=new FileOutputStream("/home/miracle/Documents/Chandini/f2.txt");
ObjectOutputStream os=new ObjectOutputStream(f); 
    os.writeObject(obj);
    os.writeObject(obj1);
    os.flush();
    os.close();
    f.close();


    }
}