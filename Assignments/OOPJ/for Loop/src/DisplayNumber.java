
public class DisplayNumber {
	
	public void OddNumber() 
	{
		System.out.println("Display all odd number from 1 to 1000");
	
		for(int iTemp = 1; iTemp  <= 1000; iTemp++)
		{
			if(iTemp % 2 != 0) 
			{
				System.out.println(iTemp);
			}
		}
	}
	
	
	
	public void EvenNumber() 
	{
		System.out.println("Display all Even number from 1 to 500");
		
		for(int iTemp = 1; iTemp  <= 500; iTemp++)
		{
			if(iTemp % 2 == 0)
			{
				System.out.println(iTemp);
			}
			
		}
	}
	
	
		
	
	public void SeventhNumber()
	{
		System.out.println("Display all Seventh number ");
		
		for(int iTemp = 1; iTemp  <= 200; iTemp++)
		{
			if(iTemp % 7 == 0)
			{
				System.out.println(iTemp);
			}
			
		}
	}
	
	
	
	public void Pattern1()
	{
		System.out.println("Display the Pattern1 ");
		
		for(int iTemp = 0; iTemp  < 5; iTemp++)
		{
			for(int jTemp = 0; jTemp < (iTemp + 1) ; jTemp++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	
	public void Pattern2()
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
	
	public void Pattern3() 
	{
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
	
	public void Pattern4()
	{
		for(int iTemp = 1; iTemp <= 6; iTemp++)
		{
			for(int jTemp = 1 ; jTemp <= iTemp ; jTemp++ )
			{
				System.out.print(jTemp + " ");
			} 
			System.out.println();
		}
	}
	
	public void Pattern5()
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
