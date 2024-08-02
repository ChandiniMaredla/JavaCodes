import java.util.ArrayList;



import java.util.Iterator;
import java.util.List;

public class A {
    public static void main(String[] args) {
        // Create an ArrayList of Integer objects
        List<Integer> list = new ArrayList<>();

        // Add integers 0 through 9 to the list
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        // Get an iterator for the ArrayList
        Iterator i = list.iterator();

        // Iterate through the list and print each element
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
