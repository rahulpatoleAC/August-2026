
public class ArrayOperation {
	
//	2. Write a Java program to sort an numeric array. The size of the array will be taken from the user, aer
//	he specifies the size all the elements of the array will be taken as input and the arryay will be sorted.
	
	public void ArrSort(int[] arr) {
		for(int i=0 ; i<arr.length;i++) {
			for(int j = i+1 ; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	
//	3. Modify the exercise 2 and Write a Java program to sum values of an array
	
	public int ArrSum(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i]; 
		}
		return sum;
	}
	
//	4. Modify exercise 2 Write a Java program to calculate average value of an array elements

	public int ArrAvg(int[] arr) {
		return ArrSum(arr)/arr.length;
	}


//	5.Modify exercise 2 Write a Java program to copy an array by itera&ng the array
	
	public void EmptyArray(int[] arr, int CopyArray[]) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			CopyArray[i] = arr[i];
		}
	}
	
//	6.Modify exercise 2 Write a Java program to find the maximum and minimum value of an array.

	public int Minimum(int[] arr) {
		int min = arr[0];
		
		for(int i = 0; i< arr.length ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
	}

	public int Maximum(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i < arr.length ; i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	
//	7.Modify exercise 2 Write a Java program to reverse an array of integer values

	public void Revese(int[] arr) {
		for(int i = arr.length - 1; i >= 0 ; i--) {
			System.out.print(arr[i] + " ");
		}
	}
	
//	8.Modify exercise 2 Write a Java program to find the duplicate values of an array of integer values

	public void Duplicate(int[] arr) {
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = i+1 ; j < arr.length ; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate value : " + arr[i]); 
					break;
				}
			}
		}
	}
	
//	Modify exercise 2 to accept 2 different values in 2 different arrays and find the common elements
//	between two arrays
	
	
	public void CommonArray(int[] arr,int[] arr1) {	
		
		for(int i = 0 ; i < arr.length ; i++ ) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[i] == arr1[j]) {
					System.out.print( arr[i] + " ");
				}
			}
		}
	}
}
