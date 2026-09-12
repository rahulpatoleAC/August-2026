/*
Using for loops write a program to display the following
pattern

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
*/
public class PatternFour {
	public static void main(String[] args)
	{
		
		for(int iTemp = 1; iTemp <= 6; iTemp++)
		{
			for(int jTemp = 1 ; jTemp <= iTemp ; jTemp++ )
			{
				System.out.print(jTemp);
			}
			System.out.println();
		}
	}

}
