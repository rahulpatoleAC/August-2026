import java.util.Scanner;

public class menuDirvenLinkedList {

    // Node class
    public static class Node {
        int data;  //data part : contains actual data of type "int"
        Node next; //next part : reference of type Node class which refers to the next node

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    } // end of class Node

    // linkedlist class
    public static class linkedList {

        Node head = null;
        Node tail = null;

        // add at last node
        void addAtLast(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // add at first node
        void addAtFirst(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // display linked list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else {

                Node temp = head;
                System.out.print("head");
                while (temp != null) {
                    System.out.print(" -> " + temp.data);
                    temp = temp.next;
                }
                System.out.print(" -> null");
            }

            System.out.println("\nLength of Linkedlist : " + length());
        }

        // length of the linkedlist
        int length() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Add at a specific position
        void addAtSpecificPosition(int pos, int data) {


            if (pos == 0) {
                addAtFirst(data);
                return;
            }
            if (pos == length()) {
                addAtLast(data);
                return;
            }

            Node newNode = new Node(data);
            Node temp = head;

            for (int i = 0; i < pos - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;

        }

        // get element of current position
        int getElement(int pos) {
            Node temp = head;
            for (int i = 0; i < pos; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // delete at first
        void deleteAtFirst() {
            if (head == null) {
                System.out.println("List is empty ");
            } else {
                if (head.next == null) {
                    head = null;
                    tail = null;
                } else {
                    head = head.next;
                }
            }
        }

        // delete at last
        void deleteAtLast() {
            if (head == null) {
                System.out.println("List is empty ");
            } else {
                if (head.next == null) {
                    head = null;
                    tail = null;
                } else {

                    Node temp = head;
                    // move temp to second last
                    while (temp.next.next != null) {
                        temp = temp.next;
                    }
                    temp.next = null;
                    tail = temp;
                }
            }
        }

        // delete at specific position
        void deleteAtSpecificPosition(int pos) {
            if (head == null) {
                System.out.println("List is empty");
            }
            if (pos == 0) {
                deleteAtFirst();
                return;
            } else if (pos == length()) {
                deleteAtLast();
                return;
            } else {
                Node temp = head;
                for (int i = 0; i < pos - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

        }
    }// end of the linkedList class

    // menu dirven class
    public static int menu() {
        System.out.println("0. exit");
        System.out.println("1. Add node at last position");
        System.out.println("2. Add node at first position");
        System.out.println("3. Add node at Specific position");
        System.out.println("4. Delete node at Last");
        System.out.println("5. Delete node at at First");
        System.out.println("6. Delete node at Specific position");
        System.out.println("7. get element of position ");
        System.out.println("8.diplay list");
        

        System.out.println("Enter the choice : ");

        // accept the choice from user
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // return choice to calling function
        return choice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos;
        int data;
        // create a empty linked list
        linkedList l1 = new linkedList();
        while (true) {
            int choice = menu();
            switch (choice) {
                // exit from loop
                case 0:
                    System.exit(0);
                    // add at last position
                case 1:
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    l1.addAtLast(data);
                    break;
                // add at first position
                case 2:
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    l1.addAtFirst(data);
                    break;
                // add at specific position
                case 3:
                    while (true) {
                        System.out.println("Enter the position : ");
                        pos = sc.nextInt();
                        if (pos >= 0 && pos <= l1.length()) {
                            break;
                        }
                        System.out.println("Invalid position ");
                    }
                    System.out.println("Enter the data : ");
                    data = sc.nextInt();
                    l1.addAtSpecificPosition(pos, data);
                    break;
                // delete at the last position
                case 4:
                    l1.deleteAtLast();
                    break;
                // delete at the first position
                case 5:
                    l1.deleteAtFirst();
                    break;
                // delete at the specific position
                case 6:
                    while (true) {
                        System.out.println("Enter the position : ");
                        pos = sc.nextInt();
                        if (pos >= 0 && pos <= l1.length()) {
                            break;
                        }
                        System.out.println("Invalid Index");
                    }
                    l1.deleteAtSpecificPosition(pos);
                    break;

                // get the element of specific position
                case 7:
                    while (true) {
                        System.out.println("Enter the position : ");
                        pos = sc.nextInt();
                        if (pos >= 0 && pos <= l1.length()) {
                            break;
                        }
                        System.out.println("Invalid Index");
                    }
                    System.out.println("Current element at position is  : " + l1.getElement(pos));
                    break;
                // display the linked list
                case 8:
                    l1.display();

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
