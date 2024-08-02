import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class Items implements Serializable {
    transient int id;
    String name;
    public Items(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public static void main(String args[]) throws IOException
    {
ArrayList<Items> list=new ArrayList<>();
list.add(new Items(1,"pen"));
list.add(new Items(2, "paper"));
FileOutputStream fo=new FileOutputStream("/home/miracle/file1.txt");
ObjectOutputStream obj=new ObjectOutputStream(fo);
obj.writeObject(list);
obj.flush();
fo.close();
obj.close();
    }
}
