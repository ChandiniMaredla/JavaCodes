import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedset {
    public static void main(String[] args) {
        LinkedHashSet ls=new LinkedHashSet();
ls.add(2);
ls.add("gjh");
ls.add(87);
ls.add("hjh");
Iterator i=ls.iterator();
while(i.hasNext())
{
    System.out.println(i.next());
}
i.remove();
System.out.println(ls);
    }
}
