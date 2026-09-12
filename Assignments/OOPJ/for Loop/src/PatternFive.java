/*

Using for loops write a program to display the following
pattern
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 
*/
public class PatternFive {
	public static void main(String[] args)
	{
		for(int iTemp = 1; iTemp <= 6; iTemp++)
		{
			for(int j = 1; j <= (6-iTemp)+1; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
