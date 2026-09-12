//Using for loops write a Java Program to display all odd
//numbers from 1 to 1000


public class OddNumber {
	
	public static void main(String[] args) {
		System.out.println("Display all odd number from 1 to 1000");
		
		for(int iTemp = 1; iTemp  <= 1000; iTemp++)
			if(iTemp % 2 != 0)
			System.out.println(iTemp);
	}
}
