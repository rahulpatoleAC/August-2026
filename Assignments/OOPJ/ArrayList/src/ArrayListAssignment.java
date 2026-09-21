
import java.util.ArrayList;

import java.util.Iterator;

import java.util.Collections;

public class ArrayListAssignment {

	public static void main(String[] args) {

//		1.Write a Java program to create a new array list, add some colors (string) and print out the collection.

		ArrayList<String> colour = new ArrayList<>();

		colour.add("Red");
		colour.add("Blue");
		colour.add("Yellow");

//		2.Modify the above Java program to insert an element into the array list at the first position.

		colour.add(0, "Green");

//		3.Modify the above Java program to retrieve an element (at a specified index) from a given array list.

		String element = (String) colour.get(2);

		System.out.println("Element at 2 : " + element);

//		4.Modify the above Java program to update specific array element by given element.
		colour.set(1, "Orange");

//		5.Modify the above Java program to remove the third element from a array list.
		colour.remove(3);

//		 6.Modify the above Java program to search an element in a array list

		if (colour.contains("Green")) {
			System.out.println("Green is present in the arrayList");

		} else {
			System.out.println("Green is not present in arrayList ");
		}

//		 7.Modify the above Java program to sort a given array list. (Hint : Use the class Collections)

		Collections.sort(colour);

//		8.Modify the above Java program to copy one array list into another. (Hint : Use the class Collections)

		ArrayList<String> colour1 = new ArrayList<>();

		colour1.add(" ");
		colour1.add(" ");
		colour1.add(" ");

		Collections.copy(colour1, colour);

//		9.Modify the above Java program to shuffle elements in a array list. (Hint : Use the class Collections)

		Collections.shuffle(colour1); // Shuffle(moving) colour1 position element in array
		Collections.shuffle(colour); // Shuffle(moving) colour position element in array

//		10.Modify the above Java program to reverse elements in a array list. (Hint : Use the class Collections)

		Collections.reverse(colour);

		System.out.println("======Colour======");
		Iterator itr = colour.iterator();

		while (itr.hasNext()) {
			String data = (String) itr.next();
			System.out.println(data);
		}

		System.out.println("======Colour1======");
		Iterator itr1 = colour1.iterator();

		while (itr1.hasNext()) {
			String data = (String) itr1.next();
			System.out.println(data);
		}

	}
}
