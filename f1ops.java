import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class f1ops {
    public static void main(String[] args) throws IOException {
        File file=new File("/home/miracle/Documents/Chandini/file.txt");
        file.createNewFile();

        FileOutputStream fo=new FileOutputStream(file);
        String s="hi this is the 1st problem in the pdf using fileoutput stream";
        byte[] b=s.getBytes();
        fo.write(b);

BufferedOutputStream bo=new BufferedOutputStream(fo);
bo.write(b);
bo.close();


        fo.close();

        
    }
}
