// Bonus Problem: Menu-Driven Java Program (Switch-Case)

import java.util.Scanner;
public class Problem_7 {
    static  byte a;
    static short b;
    static int c;
    static long d;
    static float e;
    static double f;
    static char g;
    static boolean h;
    static String i;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter the Math mark");
                int Math = sc.nextInt();
                System.out.println("Enter the Science mark");
                int Science = sc.nextInt();
                System.out.println("Enter the History mark");
                int History = sc.nextInt();

                int average = (Math + Science + History)/3;
                if(average >= 90)
                {
                    System.out.println("Grade A");
                }
                else if(average >= 70)
                {
                    System.out.println("Grade B");
                }
                else if(average >= 50)
                {
                    System.out.println("Grade C");
                }
                else
                {
                    System.out.println("Fail");
                }
                
            case 2:
                System.out.println("Enter the year");
                int year = sc.nextInt();
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
                {
                    System.out.println(year + " is a leap year ");
                }
                else
                {
                    System.out.println(year + " is not a leap year ");
                }

            case 3:
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
                        System.out.println("Invalid number");
                }

            case 4:
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(f);
                System.out.println(g);
                System.out.println(h);
                System.out.println(i);

            case 5:
                System.out.println("Exit");
            default:
                System.out.println("Invalid Choice");

        }
    }
}
