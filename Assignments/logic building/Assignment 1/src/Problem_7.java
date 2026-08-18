//largest of three number

import java.util.Scanner;
public class Problem_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n1");
        int n1 = sc.nextInt();
        System.out.println("Enter the number n2");
        int n2 = sc.nextInt();
        System.out.println("Enter the number n3");
        int n3 = sc.nextInt();

        if (n1>n2)
        {
            if(n1>n3)
            {
                System.out.println("n1 is Greater ");
            }
            else
            {
                System.out.println("n3 is Greater");
            }
        }
        else
        {
            if(n2>n3)
            {
                System.out.println("n2 is Greater ");
            }
            else
            {
                System.out.println("n3 is Greater ");
            }
        }
    }
}
