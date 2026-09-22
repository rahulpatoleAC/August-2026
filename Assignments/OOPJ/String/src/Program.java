
public class Program {

	public static void main(String[] args) {

//		Write a Java program to get the character at the given index within the String.  
//		Sample Output:
//			Original String = Java Exercises!                                                                             
//			The character at position 0 is J                                                                              
//			The character at position 10 is i
		System.out.println("====================");

		String str = "Java Exercise!";
		

		System.out.println("The character at position 0 is " + str.charAt(0));
		System.out.println("The character at position 0 is " + str.charAt(10));

//		2. Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same number of characters in the same positions.  
//		Sample Output:
//		String 1: This is Exercise 1                                                                                  
//		String 2: This is Exercise 2                                                                                  
//		"This is Exercise 1" is less than "This is Exercise 2"

		System.out.println("====================");

		String str1 = "This is the Exercise 1";
		String str2 = "This is the Exercise 2";


		int result = str1.compareTo(str2);
		if (result > 0) {
			System.out.println( "\"" + str1 + " \" is greater than \" " + str2 + "\"");
		} else if (result < 0) {
			System.out.println( "\"" + str1 + " \" is less than \" " + str2 + "\"");
		} else {
			System.out.println( "\"" + str1 + " \" is equal \" " + str2 + "\"");
		}

	
//		3. Write a Java program to check whether a given string ends with the contents of another string.  
//		Sample Output:
//		"Python Exercises" ends with "se"? false                                                                      
//		"Python Exercise" ends with "se"? true
		
		System.out.println("====================");
		
		String str3 = "Python Exercises";
		String str4 = "se";
		
		System.out.println("\"" + str3 + " \" ends with \" " + "\"" + str4 +  "\" ? " + str3.endsWith(str4)); 
	
		String str5 = "Python Exercise";

		System.out.println("\"" + str5 + " \" ends with \" " + "\"" + str4 +  "\" ? " + str5.endsWith(str4)); 
		
		
//		4.Write a Java program to get the index of all the characters of the alphabet.  
//		Sample Output:
//		a  b c  d e  f  g h i  j                                                                                     
//		=========================                                                                                     
//		36 10 7 40 2 16 42 1 6 20                                                                                     
//		                                                                                                   
//		k  l  m  n  o  p q  r  s  t                                                                                   
//		===========================                                                                                   
//		8 35 22 14 12 23 4 11 24 31                                                                                   
//
//		u  v  w  x  y  z                                                                                              
//		================                                                                                              
//		5 27 13 18 38 37
//		Sample string of all alphabet: "The quick brown fox jumps over the lazy dog."

		System.out.println("====================");
		
		String alphabet = "The quick brown fox jumps over the lazy dog.";
		
		alphabet = alphabet.toLowerCase();
		
		for(char ch = 'a' ; ch <= 'z';ch++) {
			System.out.print(ch + "  ");
		}
		
		System.out.println("\n=====================================================");
		
		
		for(char ch = 'a' ; ch <= 'z' ; ch++ ) {
			System.out.print(alphabet.indexOf(ch) + " ");
		}
		System.out.println();
			
//			5. Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.  
//			Sample string : "The quick brown fox jumps over the lazy dog."
//			In the above string replace all the fox with cat.
//			Sample Output:
//			Original string: The quick brown fox jumps over the lazy dog.                                                 
//			New String: The quick brown cat jumps over the lazy dog.
		
		System.out.println("====================");
		
		String oldString = "The quick brown fox jumps over the lazy dog.";
		String newString = oldString.replace("fox" ," cat");
		
		System.out.println("Original string : " + oldString);
		System.out.println("New string : " + newString);
						


//		6. Write a Java program to convert all the characters in a string to uppercase. 
//		 Sample Output:
//		Original String: The Quick BroWn FoX!                                                                         
//		String in uppercase: THE QUICK BROWN FOX! 
		
		String orgStr = "The Quick Brown Fox!";
		
		System.out.println("====================");
		
		String newStr = orgStr.toUpperCase();
		
		System.out.println(newStr);
		
		
//		7.Write a Java program to reverse a string.
//		Sample Output:
//		The given string is: The quick brown fox jumps
//		The string in reverse order is:
//		spmuj xof nworb kciuq ehT
		
		
		System.out.println("====================");
		
		String str6 ="The quick brown fox jumps"; 
		
		System.out.println("The given String is : " + str6);
		System.out.println("The string in reverse order is :");
		for(int i = str6.length()-1 ; i >= 0 ; i--) {
			System.out.print(  str6.charAt(i));
		}


	}

}
