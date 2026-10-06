public class BasicLinkedlist {
        public static class Node{
            int data; // value
            Node next; // address of next node
            Node(int data)
            {
                this.data = data;
            }
        }

        public static int length(Node head){
            int count = 0;
            while(head != null){
                count++;
                head = head.next;
            }
            return count;
        }

        // display linked list
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // diplay linked list by tail - recursion
        public static void displayTail(Node head){
            Node temp = head;
            if(temp == null){
                return;
            }
            System.out.print(temp.data + " ");
            displayTail(temp.next);
        }


        // diplay linked list by non tail recursion
        public static void displayNonTail(Node head){ // display reverse order
            Node temp = head;
            if(temp == null){
                return;
            }
            displayNonTail(temp.next);
            System.out.print(temp.data + " ");
        }

        public static void main(String[] args){
            // creating node
            Node a = new Node(11); // head node
            Node b = new Node(22);
            Node c = new Node(33);
            Node d = new Node(44);
            Node e = new Node(55);
            // connecting linkedlist
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

//        System.out.println(a); // give hashcode of a
//        System.out.println(a.data); // give value
//        System.out.println(a.next); // give hashcode of b
//        System.out.println(b); // give hashcode of b

            // display linkedlist
//        Node temp = a;
//        while(temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

            display(a); // display function call
            System.out.println();
            displayTail(a); // display tail recursion function call
            System.out.println();

            // display reverse order
            displayNonTail(a); // display non tail recursion function call

            System.out.println("\ncount node = " + length(a));
        }


}
