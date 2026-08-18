//Print area of square

import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square a ");
        int a = sc.nextInt();

        int areaOfSquare = a*a;
        System.out.println("Area of square is ");
        System.out.println(areaOfSquare);
    }
}
