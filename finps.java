import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class finps {
    public static void main(String[] args) throws IOException {
        try {
            FileInputStream f=new FileInputStream("/home/miracle/Documents/Chandini/f1.txt");
            int i=f.read();
            System.out.println((char)i);
            i=0;
            while((i=f.read())!=-1)
            {
                System.out.println((char)i);
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
