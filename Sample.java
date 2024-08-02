public class Sample {
    public static void main(String[] args) {
        Student obj=new Student(1,"efd");
        System.out.print(obj.id);
    }
}
class Student
{
    public static final int n = 0;
    int id;
    String s;
    Student(int id,String s)
    {
this.id=id;
this.s=s;
    }
}
