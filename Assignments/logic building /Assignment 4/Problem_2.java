//Print Multiples of 3 between 1 and N

import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            if(i % 3 == 0)
            {
                System.out.print( i + " " );
            }
        }
    }
}