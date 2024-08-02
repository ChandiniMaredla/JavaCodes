import java.io.FileOutputStream;
import java.io.IOException;
public class fops1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream obj=new FileOutputStream("/home/miracle/Documents/Chandini/f1.txt");
        String s="hi welcome to files concept. my name is chandini.";
        byte b[]=s.getBytes();
        obj.write((b));
        obj.write('M');
        obj.close();
        System.out.println("success");
    }
}
