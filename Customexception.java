
class A extends Exception
{
    A(String s)
    {
        super(s);
    }
}
class Customexception 
{
    public static void main(String args[]) //throws Exception
    {
int a=10,b=10;
try{
if(a==b)
throw new A("Both are equal");
}
catch (Exception e)
{
    System.out.println(e.getMessage());
}
    }
}
