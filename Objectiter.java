import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

class Objectiter
{
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        Student obj1=new Student(1,"asd");
        Student obj2=new Student(2,"gdhg");
        l.add(obj1);
        l.add(obj2);
        Iterator i=l.iterator();
        while(i.hasNext())
        {
            Student obj3=(Student)i.next();
            System.out.println(obj3.id);
        }
    }
}
class Student{
    int id;
    String s;
    Student(int id,String s)
    {
        this.id=id;
        this.s=s;
    }
}