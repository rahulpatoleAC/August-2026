import java.util.Scanner;

public class ImplementDoublyLinkedlist {
    public static class Node {
        int data; //
        Node next; // reference of type Node class
        Node prev; // reference of type Node class

        // constructor of Node class
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }// end of the class node

    public static class doublyLinear {
        Node head = null;
        Node tail = null;

        // add at last
        void addAtLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
            }
            tail = newNode;
        }

        // add at first
        void addAtFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        // calculate length of linked list
        int length(){
            int count = 0;
            Node trav = head;
            while(trav != null){
                count++;
                trav = trav.next;
            }
            return count;
        }

        // add at specific position
        void addAtSpecificPosition(int pos,int data){

            if(pos == 0){
                addAtFirst(data);
                return;
            }

            if(pos == length()){
                addAtLast(data);
                return;
            }
            Node newNode = new Node(data);
            Node trav = head;
            for(int i = 0; i < pos - 1; i++){
                trav = trav.next;
            }

            //attach cur (pos)th node into next part of newly created node
            newNode.next = trav.next;
            //attach (pos-1)th node into prev part of newly created node
            newNode.prev = trav;
            //attach newly created node into the prev part of cur (pos)th node
            trav.next.prev = newNode;
            //attach newly created node into the next part of cur (pos-1)th node
            trav.next = newNode;

        }

        // display from head
        void display() {
            if (head == null) {
                System.out.println("List is  empty");
                return;
            } else {
                Node trav = head;
                System.out.print("head");
                while (trav != null) {
                    System.out.print("->" + trav.data);
                    trav = trav.next;
                }
                System.out.println("->null");
            }
            System.out.println("Length of doubly Linked list : " + length());
            System.out.println();
        }



        // display from tail
        void displayReverse() {
            if (head == null) {
                System.out.println("List is  empty");
                return;
            } else {
                Node trav = tail;
                System.out.print("tail");
                while (trav != null) {
                    System.out.print("->" + trav.data);
                    trav = trav.prev;
                }
                System.out.println("->null");
            }
        }

        // delete at last
        void deleteAtLast(){
            if(head == null){
                System.out.println("list is empty ");
            }else{
                if(head.next == null){
                    head = null;
                    tail = null;
                }else {
                    Node trav = head;
                    // move to the second last
                    while(trav.next.next != null){
                        trav = trav.next;
                    }
                    trav.next = null;
                    tail = trav;
                }
            }
        }

        // delete at first
        void deleteAtFirst(){
            if(head == null){
                System.out.println("List is empty");
            }else{
                if(head.next == null){
                    head = null;
                    tail = null;
                }else{
                    head = head.next;
                    head.prev = null;
                }
            }
        }

        // delete at specific position
        void deleteAtSpecificPosition(int pos){
            if(head == null){
                System.out.println("List is empty");
            }

            if(pos == 0){
                deleteAtFirst();
                return;
            }else{
                if(pos == length()){
                    deleteAtLast();
                    return;
                }
                else{
                    Node trav = head;
                    for(int i = 0; i < pos-1; i++){
                        trav = trav.next;
                    }
                    trav.next = trav.next.next;
                    trav.next.prev = trav;
                }
            }
        }

    } // end of doubly linked list class

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos;
        doublyLinear dl = new doublyLinear();
        // add at last position
        dl.addAtLast(10);
        dl.addAtLast(20);
        dl.addAtLast(30);
        //  add at first position
        dl.addAtFirst(9);
        dl.addAtFirst(8);

        try{
            dl.display();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

//        // add at specific position
//        while(true){
//            // step 1: accept position from user
//            System.out.println("Enter position : ");
//            pos = sc.nextInt();
//
//            // step 2: validate position
//            if(pos >= 0 && pos <= dl.length() ){
//                break;
//            }
//            System.out.println("Invalid position : ");
//        }
//        dl.addAtSpecificPosition(pos,33);
//
//        try{
//            dl.display();
//        }catch(RuntimeException e){
//            System.out.println(e.getMessage());
//        }
        System.out.println();
        System.out.println();

        dl.deleteAtLast();
        dl.display();
        dl.deleteAtFirst();
        dl.display();
        dl.deleteAtSpecificPosition(1);
        dl.display();

    }
}


