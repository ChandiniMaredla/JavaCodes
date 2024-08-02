import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Itemsdes {
    public static void main(String args[]) throws IOException, ClassNotFoundException
    {
        try{
        FileInputStream fi=new FileInputStream("/home/miracle/file1.txt");
        ObjectInputStream obj=new ObjectInputStream(fi);
       
            ArrayList<Items> list=(ArrayList<Items>)obj.readObject();
            Iterator i1=list.iterator();
            while(i1.hasNext())
            {
                Items i=(Items)i1.next();
                System.out.println(i.id+" "+i.name);
            }
            obj.close();
        fi.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
}
