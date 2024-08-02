import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class binps {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("/home/miracle/Documents/Chandini/file.txt");
        // int i;
        // while((i=f.read())!=-1)
        // {
        //     System.out.println((char)i);
        // }
        BufferedInputStream bi=new BufferedInputStream(f);
        int j;
        while((j=bi.read())!=-1)
        {
            System.out.print((char)j);
        }
        bi.close();
        f.close();
    }
}
