//Write a Java program that takes an integer between 1 and 7 and prints the corresponding day of the
// week using a switch-case statement.
// If the input is outside the range of 1 to 7, the program should display "Invalid day number".

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("The day is Monday");
                break;
            case 2:
                System.out.println("The day is Tuesday");
                break;
            case 3:
                System.out.println("The day is Wednesday");
                break;
            case 4:
                System.out.println("The day is Thursday");
                break;
            case 5:
                System.out.println("The day is Friday");
                break;
            case 6:
                System.out.println("The day is Saturday");
                break;
            case 7:
                System.out.println("The day is Sunday");
                break;
            default:
                System.out.println("Invalid day");

        }

    }
}
