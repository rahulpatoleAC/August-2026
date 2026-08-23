//Calculate the Sum of Numbers from 1 to N (Using for Loop)

import java.util.Scanner;
public class Problem_6 {
    static int calculateSum(int a){
        int sum = 0;
        for(int i=1;i<=a;i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int sum = calculateSum(number);
        System.out.println("sum = " + sum);
    }
}
