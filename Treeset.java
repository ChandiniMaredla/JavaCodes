import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        TreeSet ls=new TreeSet();
ls.add("abc");

ls.add("123");
ls.add("ABC");
Iterator i=ls.iterator();
while(i.hasNext())
{
    System.out.println(i.next());
}
i.remove();
System.out.println(ls);
    }
}
