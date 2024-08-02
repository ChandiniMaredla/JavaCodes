/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    String name;
    int id;
    Main(String name,int id){
        this.name=name;
        this.id=id;
    }
    
	public static void main(String[] args) {
	Main o1=new Main("chandini",1);
	Main o2=new Main("chandini",2);
	Main o3=new Main("chan",3);
	HashMap<String,Main> hm=new HashMap<>();
    if(!hm.containsKey(o1.name)){
        hm.put(o1.name,o1);
    }
      if(!hm.containsKey(o2.name)){
        hm.put(o2.name,o2);
    }
      if(!hm.containsKey(o3.name)){
        hm.put(o3.name,o3);
    }
	for(Map.Entry<String,Main> entry: hm.entrySet())
	{
	    Main obj= (Main)entry.getValue();
	    System.out.println(obj+" "+obj.name+" "+obj.id);
	}
	}
}
