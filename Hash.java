import java.util.*;
public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        //hs.add("jgg");
        hs.add(21);
        // hs.add("c");
        // hs.add("C");

       
        System.out.print(hs);
        Iterator i=hs.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        i.remove();
        System.out.println(hs);
        
    }
}
