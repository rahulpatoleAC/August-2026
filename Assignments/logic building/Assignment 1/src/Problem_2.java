//Check Negative number
import java .util.Scanner;
public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int b = sc.nextInt();

        if(b<=0)
        {
            System.out.println("The Number is Negative ");
        }
        else
        {
            System.out.println("The Number is Positive ");
        }

    }
}
