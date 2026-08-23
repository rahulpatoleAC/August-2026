//Write a Java program that displays a "Good Morning" message if the
//predefined time is between 5 AM and 12 PM. Use an if statement to implement the logic

import java.util.Scanner;
public class Problem_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your time");
        int time = sc.nextInt();

        if(time >= 5 && time < 12)
        {
            System.out.println("Good morning ");
        }
        else
        {
            System.out.println("Invalid Time ");
        }

    }
}
