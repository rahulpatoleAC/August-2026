//Write a Java program that calculates the average marks of a student and determines the grade based on the following criteria:
//Grade A: Average marks ≥ 90
//Grade B: Average marks between 70 and 89
//Grade C: Average marks between 50 and 69 Grade D: Average marks between 30 and 49
//Fail: Average marks < 30

import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Math");
        int Math = sc.nextInt();
        System.out.println("Enter the marks of Science");
        int Science = sc.nextInt();
        System.out.println("Enter the marks of History");
        int History = sc.nextInt();

        int average = (Math+Science+History)/3;

        if(average >= 90) {
            System.out.println("Grade A");
        }
        else if (average >=70 && average <= 89) {
            System.out.println("Grade B");
        }
        else if(average >= 50 && average <= 69){
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Fail");
        }


    }
}
