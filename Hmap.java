import java.util.*;
public class Hmap {
    public static void main(String[] args) {
        HashMap hm=new HashMap();
        hm.put(1,1);
        hm.put(2.8,"h");
        hm.put("a",10);
        Set s=hm.entrySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Map.Entry entry= (Map.Entry)i.next();
            System.out.println();
            System.out.println(entry.getValue()+" "+entry.getKey());
        }
    }
}
