import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of the arrays : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Array element are : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nMaximum element ");
        int MAX = arr[0];
        for(int i = 0; i < n ; i++){
            if(  arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        System.out.println("Max = " + MAX);

        System.out.println("\nMinimum element ");
        int MIN = arr[0];
        for(int i = 0; i < n ; i++){
            if(arr[i] < MIN){
                MIN = arr[i];
            }
        }
        System.out.println("Min = " + MIN);


    }
}
