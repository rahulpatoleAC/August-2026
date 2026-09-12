/*
Using for loops write a program to display the following
pattern
*****
****
***
**
*
*/
public class PatternTwo {

	public static void main(String[] args) 
	{
		for(int iTemp = 0; iTemp < 5; iTemp++) 
		{
			for(int jTemp = 0;jTemp < (5-iTemp) ; jTemp++ ) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
