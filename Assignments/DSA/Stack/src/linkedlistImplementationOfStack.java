import java.util.Scanner;

// create a class node
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// create a class stack
class Stack2{
    Node top = null;

    // push function
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // pop function
    void pop(){
        if(top == null){
            System.out.println("Stack under flow");
        }else {
            top = top.next;
        }
    }

    // peek function
    int peek(){
        if(top == null){
            System.out.println("Stack under flow");
            return -1;
        }else{
            return top.data;
        }
    }

    // display all stack element
    void display(){
        if(top == null){
            System.out.println("Stack under flow");
        }else{
            Node trav = top;
                System.out.print("Stack element : ");
            while(trav != null){
                System.out.print(trav.data + " " );
                trav = trav.next;
            }
            System.out.println();
        }
    }

}// end of stack class


public class linkedlistImplementationOfStack {

    public static int menu(){
        System.out.println("0.exit");
        System.out.println("1.push element on stack");
        System.out.println("2.pop topmost element of stack");
        System.out.println("3.peek topmost element of stack");
        System.out.println("4.display the stack");

        System.out.println("Enter your choice : ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
    public static void main(String[] args){
        Stack2 s = new Stack2();
        int ele;
        Scanner sc = new Scanner(System.in);

        while(true){
            int choice = menu();
            switch(choice){
                case 0:
                    System.exit(0);

                case 1: // pushed the element on stack
                    System.out.println("Enter the element");
                    ele = sc.nextInt();
                    s.push(ele);
                    System.out.println("The element pushed is " + ele);
                    break;

                case 2:// pop top most element from stack
                    ele = s.peek();
                    s.pop();
                    System.out.println("The pooped element is " + ele);
                    break;

                case 3:// peek topmost element of the stack
                    ele = s.peek();
                    System.out.println("The peek element is " + ele);
                    break;

                case 4:
                    s.display();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
