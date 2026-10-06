
// linear linked list
public class linkedListImplement {

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
            if(head == null){
                System.out.println("List is empty");
                return;
            }else {

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

            if (pos < 0 || pos > length()) {
                System.out.println("Invalid Index");
                return;
            }

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

        // get element of curretn position
        int getElement(int pos) {
            Node temp = head;
            for (int i = 0; i < pos ; i++) {
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
                for (int i = 0; i < pos-1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }

        }


    }// end of the linkedList class


    public static void main(String[] args) {

        linkedList l1 = new linkedList();

        l1.addAtLast(30);
        l1.addAtLast(40);
        l1.addAtLast(50);
        l1.display(); // head -> 30 -> 40 -> 50 -> null

        System.out.println();

        l1.addAtFirst(20);
        l1.addAtFirst(10);
        l1.display(); // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null


        System.out.println();
        System.out.println("\nCount of nodes : " + l1.length());

        l1.addAtSpecificPosition(0,9);
        l1.display(); // head -> 9 -> 10 -> 20  -> 40 -> 50 -> null

        l1.deleteAtSpecificPosition(0);
        l1.display(); // head -> 10 -> 20  -> 40 -> 50 -> null
        System.out.println("\nCount of nodes : " + l1.length());

        System.out.println();

        l1.addAtSpecificPosition(2,30);
        l1.display(); // head -> 10 -> 20 -> 30 -> 40 -> 50 -> null
        System.out.println("\nCount of nodes : " + l1.length());



    }
}
