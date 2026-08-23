//Calculate the Factorial of a Number n

import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();

        int factorial = 1;
        for(int i=1;i<=n;i++)
        {
            factorial = factorial * i;
        }
        System.out.println("factorial = " + factorial);
    }
}