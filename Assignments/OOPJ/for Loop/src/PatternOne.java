/*
 * Using For loops write a program to display the following
pattern
*
**
***
****
*****
*/
public class PatternOne {

	public static void main(String[] args) {
		
		for(int iTemp = 0; iTemp < 5; iTemp++)
		{
			for(int jTemp = 0; jTemp < (iTemp+1); jTemp++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
