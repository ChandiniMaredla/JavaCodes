
import java.util.*;

public class Hmap2 {
    public static void main(String[] args) {
            Map<Integer,Integer> mp=new TreeMap<>();
            
            mp.put(2,20);
            mp.put(9,89);mp.put(1,10);
            mp.put(4,3);
            mp.put(1,20);
            mp.put(100,10);
            mp.put(4,10);
                for (Map.Entry entry : mp.entrySet()) {
System.out.println(entry.getKey()+" "+entry.getValue());
            }
            System.out.println(mp.values());
            System.out.println(mp);
            System.out.println(mp.keySet());
    }
}
