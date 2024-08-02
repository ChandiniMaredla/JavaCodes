import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bops1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream("/home/miracle/Documents/Chandini/f1.txt");
        BufferedOutputStream bout=new BufferedOutputStream(f);
        String s=" hello good aftrnoon hi welcome to files concept. my name is chandini.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        f.close();
        
    }
}
