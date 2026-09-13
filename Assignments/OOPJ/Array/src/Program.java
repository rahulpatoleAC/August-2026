
public class Program {

	public static void main(String[] args) {
		
		
		ComplexNumber complexNo = new ComplexNumber();
		complexNo.setNum1(2);
		complexNo.setNum2(5);
		
		complexNo.displayComplex();
		
		System.out.println("Multiplication : "+ complexNo.ComputeComplexNumber());
		
		System.out.println("Enter array size : ");
		int n = ConsoleInput.getInt();
	
		ComplexNumber[] Array = new ComplexNumber[n];
		
		for(int i = 0 ; i < Array.length ; i++) {
			Array[i] = new ComplexNumber();
			
			System.out.println("Enter the num1 : ");
			int num1 = ConsoleInput.getInt();
			
			System.out.println("Enter the num2 : ");
			int num2 = ConsoleInput.getInt();
			
			Array[i].setNum1(num1);
			Array[i].setNum2(num2);
					
		}
		
		System.out.println(" Complex number are : ");
		
		for(int i = 0; i < Array.length ; i++) {
			Array[i].displayComplex();
		}
		
		

		System.out.println("Enter array size : ");
		int size = ConsoleInput.getInt();
		
		int[] arr = new int[size];
		
		
		System.out.println("Enter arr element : ");
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = ConsoleInput.getInt();
		}

		System.out.println("Enter arr1 element : ");
		
		int[] arr1 = new int[size];
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr1[i] = ConsoleInput.getInt();
		}
		
		
		ArrayOperation Arr = new ArrayOperation();
		
//		2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, aer
//		he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
		
		Arr.ArrSort(arr);
		
		System.out.print("Sorted Array : ");
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
//		3. Modify the exercise 2 and Write a Java program to sum values of an array		
		
		System.out.println(" Sum of Array : " + Arr.ArrSum(arr));
		
		
//		4. Modify exercise 2 Write a Java program to calculate average value of an array elements
		
		System.out.println(" Average of the Array : " + Arr.ArrAvg(arr));
	
	
//		5.Modify exercise 2 Write a Java program to copy an array by itera&ng the array
		
		System.out.print("Creating a Copy Array : ");
		
		int[] copyArray = new int[arr.length];
		Arr.EmptyArray(arr, copyArray);
		
		for(int i = 0 ; i < arr.length  ; i++) {
			System.out.print(copyArray[i] + " ");
		}
		
//		6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.
	
		System.out.println("\n Minimum value of array : " + Arr.Minimum(arr));
		System.out.println("\n Maximum value of array : " + Arr.Maximum(arr));
	
		
//		7.Modify exercise 2 Write a Java program to reverse an array of integer values
	
		System.out.print("Reverse of Array : ");
		Arr.Revese(arr);
	
//		8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values
		
		System.out.println();
		Arr.Duplicate(arr);
		
		
//		Modify exercise 2 to accept 2 different values in 2 different arrays and find the common elements
//		between two arrays
		
		System.out.print(" Common element : ");
		
		ArrayOperation CommonElement = new ArrayOperation();
		
		CommonElement.CommonArray(arr,arr1);
		
	}

}
