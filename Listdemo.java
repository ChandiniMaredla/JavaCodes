import java.util.*;
public class Listdemo {
public static void main(String[] args) {
    LinkedList list=new LinkedList();
    list.add(1);
    list.add('a');
    list.add("chandini");
    list.add(3.7);
    System.out.println(list);   
List<Integer> l1=new ArrayList<>();
        // l1.addAll(list);System.out.println(l1);
        Iterator i=l1.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        l1.removeAll(list);
        System.out.println(list);System.out.println(l1);
        l1.retainAll(list);
        System.out.println(l1);
        list.retainAll(l1);
         System.out.println(list);
         list.add(0,"chinna");System.out.println(list);
}
}
