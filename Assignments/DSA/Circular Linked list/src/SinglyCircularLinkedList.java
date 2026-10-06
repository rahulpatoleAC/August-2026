
public class SinglyCircularLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }// end of class Node

    public static class singlyCicular{
        Node head = null;



        // add at last

        void addAtLast(int data){
            // step 1 : create a newNode
            Node newNode = new Node(data);

            // step 2: if list is empty then attach newly created node to head
            if(head == null){
                head = newNode;
                //attach first node into the next part of newly created node added at last position
                newNode.next = head;
            }else{
                // step 3 : if list is not empty t
                // start traversal of the tree from 1st node
                Node trav = head;
                // step 4 : traverse till last node
                while(trav.next != head){
                    trav = trav.next;
                }
                // step 5 : attach newly created node to the head
                trav.next = newNode;
                //step 6: attach first node into the next part of newly created node added at last position
                newNode.next = head;
            }
        }


        // add at first position
        void addAtFirst(int data){
            // step 1 : create a newNode
            Node newNode = new Node(data);

            //step 2 : if list is empty then attach newly created node to the head
            if(head == null){
                head = newNode;
                //attach first node into the next part of newly created node added at last position
                newNode.next = head;
            }else{
                // step 3 : if list is not empty
                // start traversal of the list from first node
                Node trav = head;
                // traversal till last node
                while(trav.next != head){
                    trav = trav.next;
                }
                //attach cur first node into the next part of newly created node
                newNode.next = head;
                //attach newly created node to the head
                head = newNode;
                // update next part of the last node by newly added node at first position
                trav.next = head;

            }
        }


        // length of the linkedlist
        int length() {
            int count = 0;
            Node trav = head;
            while (trav.next != head) {
                count++;
                trav = trav.next;
            }
            return count;
        }
        // display list
        void display(){
            // if list is empty
            if(head == null){
                System.out.println("list is empty");
            }else{
                // if list is not empty
                Node trav = head;
                System.out.print("head");
                while(trav.next != head){
                    System.out.print("->" + trav.data);
                    trav = trav.next;
                }

            }
            System.out.println("\nLength of linked list : " + length());
        }

        void deleteAtFirst() {
            // step 1 : check list is  empty
            if (head == null) {
                throw new RuntimeException("List is empty");
            } else {
                // if list is not empty
                // step 2: if list contain only one node
                if (head.next == head) {
                    head = null;
                } else {
                    // step 3 : list contain more than one node
                    // start traversal from first node
                    Node trav = head;
                    // traverse the list till last node
                    while (trav.next != head) {
                        trav = trav.next;
                    }

                    // attach cur second node to the head
                    head = head.next;
                    // update next part of the last node by head
                    trav.next = head;
                }
            }
        }

        void deleteAtLast() {
            //step 1 : check list is  empty
            if (head == null){
                throw new RuntimeException("List is empty");
            }else{
                // if list is not empty
                // step 2 : if list contain only one element
                if(head.next == head){
                    // make head as null
                    head = null;
                }else {
                    // step 3 : list contain more than one element
                Node trav = head;
                // traverse the list till second last node
                    while(trav.next.next != head){
                        trav = trav.next;
                    }
                    //attach address of 1st node into the next part of current second last node
                    trav.next = head;
                }
            }
        }
    }

    public static void main(String[] args){
        singlyCicular sc = new singlyCicular();
        // add at last
        sc.addAtLast(10);
        sc.addAtLast(20);
        sc.addAtLast(30);
        sc.addAtLast(40);

        // add at first
        sc.addAtFirst(9);
        sc.addAtFirst(8);
//        sc.display();

        // delete at first
        sc.deleteAtFirst();
//        sc.display();

        // delete at last
        sc.deleteAtLast();

       try{
           sc.display();
       }catch(RuntimeException e){
           System.out.println(e.getMessage());
       }
    }
}
