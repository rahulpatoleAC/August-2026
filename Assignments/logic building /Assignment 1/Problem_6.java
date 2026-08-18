//Area of rectangle

import java.util.Scanner;
public class Problem_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length  ");
        int L = sc.nextInt();
        System.out.println("Enter the Breadth  ");
        int B = sc.nextInt();
        int Area = L*B;
        System.out.print("Area of rectangle is ");
        System.out.println(Area);
    }
}
