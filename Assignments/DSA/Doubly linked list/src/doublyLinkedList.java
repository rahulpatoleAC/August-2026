public class doublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }// end of the Node class

    // diplay doubly linear linked list
    public static void display(Node head){
        Node trav = head;
        System.out.print("Head");
        while(trav != null){
            System.out.print("->" + trav.data);
            trav = trav.next;
        }
        System.out.print("->null");
    }
    // display linked list reverse
    public static void displayReverse(Node tail){
        Node trav = tail;
        System.out.print("tail");
        while(trav != null){
            System.out.print("->" + trav.data);
            trav = trav.prev;
        }
        System.out.print("->null");
    }
    // display from any random node 
    public static void displayRandom(Node random){
        Node trav = random;
        // traversal backward to head
        while(trav.prev != null){
            trav = trav.prev;
        }

        // now trav is pointing to head
        //print the list
        System.out.print("Head");
        while(trav != null){
            System.out.print("->" + trav.data);
            trav = trav.next;
        }
        System.out.print("->null");
    }

    public static void main(String[] args){
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);

            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = e;
            e.prev = d;
            e.next = null;

            display(a);
            System.out.println();
            displayReverse(e);
            System.out.println();
            displayRandom(c);


    }
}
