//Sum of Two Numbers (Using a Method)

import java.util.Scanner;
public class Problem_1 {
    static int sumOfTwoNumber(int a,int b){
        int result = a + b;
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        int Sum =  sumOfTwoNumber(num1,num2);

        System.out.println("Sum = " + Sum);

    }
}
