/*
Using for loops write a program to display the following
pattern
1
2 3
4 5 6
7 8 9 10 
*/
public class PatternThree {

	public static void main(String[] args) {
		
		int num = 1;
		for(int iTemp = 0; iTemp < 5; iTemp++)
		{
			for(int jTemp = 0; jTemp < iTemp ; jTemp++)
			{
				System.out.print(num + " " );
				num++;
			}
			System.out.println();
		}

	}

}
