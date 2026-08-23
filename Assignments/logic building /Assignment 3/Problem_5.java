//Print Multiplication Table (Using for Loop)
import java.util.Scanner;
public class Problem_5 {
    static void printMultiplicationTable(int a){
        for(int i=1;i<=10;i++)
        {
            System.out.println(a+" * "+i+" = "+ (a*i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number : ");
        int number = sc.nextInt();
      printMultiplicationTable(number);

    }
}
