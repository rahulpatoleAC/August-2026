//Print Even Numbers (Using while Loop)

import java.util.Scanner;
public class Problem_3 {
    static void printEvenNumber(int a){
        int i = 1;
         while(i <= a ) {
             if (i % 2 == 0) {
                 System.out.println(i);
             }
                 i++;
         }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        printEvenNumber(number);

    }
}
