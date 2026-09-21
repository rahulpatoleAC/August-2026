
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {

//		11.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.

		TreeSet<String> colour = new TreeSet<>();

		colour.add("Red");
		colour.add("Yellow");
		colour.add("Green");

//		12.Modify the above Java program to add all the elements of a specified tree set to another tree set.
		TreeSet<String> colour1 = new TreeSet<>();
		colour1.add("");
		colour1.add("");
		colour1.add("");

		colour1.addAll(colour);

//		 13.Modify the above Java program to create a reverse order view of the elements contained in a given tree set.

		Iterator itr = colour.descendingIterator();

		System.out.println("=====colour=====");
		while (itr.hasNext()) {
			String data = (String) itr.next();
			System.out.println(data);
		}

//		 14.Modify the above Java program to get the first and last elements in a tree set.
		
		String First = colour.first();
		String last = colour.last();
		
		System.out.println("First : " + First);
		System.out.println("Last : " + last);
		
		
//		15.Write a Java program to get the element in a tree set which is greater than or equal to the given element. (Hint : Use the ceiling method of the TreeSet)
		String result = colour.ceiling("Blue");  
		System.out.println("Result : " + result);
		
		Iterator itr1 = colour.iterator();

		System.out.println("=====colour1=====");
		while (itr1.hasNext()) {
			String data = (String) itr1.next();
			System.out.println(data);
		}
	}

}
