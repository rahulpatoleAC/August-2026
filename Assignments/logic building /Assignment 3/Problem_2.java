//Simple Age Checker (Using a Method)

import java.util.Scanner;

public class Problem_2 {
    static String checkAgeCategory(int a){
        if(a>0 && a<18)
        {
         return "You are a Minor";
        }
        else if (a>=18 && a<=60)
        {
            return "You are an Adult";
        }
        else if (a>60)
        {
            return "You are a senior citizen";
        }
        else
        {
            return "Invalid Age ";
        }
    }

    public  static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age ");
       int age = sc.nextInt();
       String Category = checkAgeCategory(age);
       System.out.println(Category);
    }
}
