//using for loops write a Java Program to display all even
//numbers from 1 to 500.
public class EvenNumber {

	public static void main(String[] args) {
		System.out.println("Display all odd number from 1 to 500");
		
		for(int iTemp = 1; iTemp <= 500 ; iTemp ++ )
			if(iTemp % 2 == 0)
				System.out.println(iTemp);

	}

}
