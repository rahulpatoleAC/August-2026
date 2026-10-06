
import java.util.Scanner;

public class secondLargestElement {
    public static void main(String[] args) {
        // taking input from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array : ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        taking input from user
//        System.out.println("Enter the element of the array : ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        printing the array element
//        System.out.println("Array element are : ");
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }

        // hard coded value given to array
        int[] arr = {12, 5, 8, 20, 15, 20, 7};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < 5; i++) {
            if ( arr[i] > largest) {
                largest = arr[i];
            }
        }
            System.out.println("Largest = " + largest);
        for(int i = 0; i < 5; i++){
            if(arr[i] > secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
            System.out.println("Second Largest : " + secondLargest);
    }
}