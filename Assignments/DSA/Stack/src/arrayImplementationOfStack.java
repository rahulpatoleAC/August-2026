import java.util.Scanner;

class Stack1{
    int[] arr;
    int top;

    // default constructor (used when stack value is not given in main function)
    Stack1(){
        arr = new int[5];
        top = -1;
    }

    //parameterized constructor (used when stack value is given in main function)
    Stack1(int size){
        arr = new int[size];
        top = -1 ;
    }
    void push(int ele){
        // fixed sized array
        if(top == arr.length-1){
            System.out.println("Stack is full");
        }else{
            top++;
            arr[top] = ele;
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack is underflow");
        }else{
            top--;
        }
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack is underFlow");
            return -1;
        }else{
            return (arr[top]);
        }
    }

    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }else{

            System.out.print("Stack element are : ");
            for(int i = 0; i<=top;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}

public class arrayImplementationOfStack {
    public static int menu(){

        System.out.println("0. exit");
        System.out.println("1. push the element on stack ");
        System.out.println("2. pooped the element from stack");
        System.out.println("3. peek the topmost element of stack");
        System.out.println("4. display the stack all element ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args){

        Stack1  s = new Stack1();
        int ele ;
        Scanner sc= new Scanner(System.in);

        while(true){
            int choice = menu();
            switch(choice){
                case 0:
                    System.exit(0);


                case 1: // push the element on stack
                    System.out.println("Enter the number : ");
                    ele = sc.nextInt();
                    s.push(ele);
                    System.out.println(ele + " pushed on the stack");
                    break;

                case 2: // pop topmost  element from the stack
                    ele = s.peek();
                    s.pop();
                    System.out.println("pooped element is " + ele);
                    break;

                case 3:// peek(display) only the topmost element
                    ele = s.peek();
                    System.out.println("The topmost element " + ele);
                    break;

                case 4: // display all the stack element
                    s.display();
                    break;

                default:
                    System.out.println("Invalid choice ");

            }
        }
    }
}
