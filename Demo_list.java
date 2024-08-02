/**
 * Demo_list
 */
import java.util.*;
public class Demo_list {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add('a');
        list.add("chandini");
        list.add(3.7);
        System.out.println(list);
        ArrayList<Integer> l1=new ArrayList<>();
        l1.addAll(list);System.out.println(l1);
        l1.removeAll(list);
        System.out.println(list);System.out.println(l1);
        l1.retainAll(list);
        System.out.println(l1);
        list.retainAll(l1);
         System.out.println(list);
    }
}