import java.util.HashMap;
import java.util.Map;

import javax.swing.text.Style;

public class Hmethods {
    public static void main(String[] args) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(1,80);
        hm.put(6,979);
        hm.put(7,68);
        hm.put(13,37);
        Map<Integer,Integer> mp=new HashMap<>();
        mp.putAll(hm);
        System.out.println(hm.containsKey(9));
        System.out.println(hm.containsValue(37));
        System.out.println(hm.entrySet());
        System.out.println(mp.equals(hm));
        System.out.println(hm.get(hm));
        System.out.println(hm.isEmpty());
        mp.put(6,1000);
        System.out.println(mp.size());
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());
        hm.putIfAbsent(1000,0);



    }
}
