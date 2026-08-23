//User Input for Positive Numbers (Using do-while Loop)

import java.util.Scanner;
public class Problem_4 {
    static int askForPositiveNumber(Scanner sc){
        int a;
        do{
            System.out.println("Enter the number");
            a = sc.nextInt();
        }while(a<=0);
        return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = askForPositiveNumber(sc);
        System.out.println("You enter a positive number : " + result);
    }
}
