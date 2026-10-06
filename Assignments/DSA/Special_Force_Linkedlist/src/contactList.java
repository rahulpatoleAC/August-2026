
// contact list using singly linkedlist
public class contactList {
    public static class Node {
        String name;
        String phone;
        Node next;

        Node(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.next = null;
        }
    }// end of the class Node

    public static class singlyLinkedList {
        Node head = null;
        Node tail = null;

        // add contact to list from last
        void addContact(String name, String phone) {
            Node newNode = new Node(name, phone);
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        // length of linked list
        int length() {
            int count = 0;
            if (head == null) {
                System.out.println("List is empty");
            } else {
                Node trav = head;
                while (trav != null) {
                    count++;
                    trav = trav.next;
                }
            }
            return count;
        }

        // display contact list
        void displayContact() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            } else {
                Node trav = head;
                while (trav != null) {
                    System.out.println(trav.name + " " + trav.phone);
                    trav = trav.next;
                }
            }
            System.out.println("length of the linkedlist : " + length());
        }

        // search contact

        boolean searchContact(String name) {
            Node trav = head;

            while (trav != null) {
                if (trav.name.equalsIgnoreCase(name)) {
                    return true;
                }
                trav = trav.next;
            }
            return false;
        }

        void removeContact(String name) {
            if (head == null) {
                System.out.println("List is empty");
            } else if (head.name.equalsIgnoreCase(name)) {
                head = head.next;
                if(head == null){
                tail = null;
                }
                return;
            } else {
                Node trav = head;
                while (trav.next != null) {
                    if (trav.next.name.equalsIgnoreCase(name)) {
                        if (trav.next == tail) {
                            tail = trav;
                        }
                        trav.next = trav.next.next;
                        return;
                    }
                    trav = trav.next;
                }
            }

        }// end of the singlyLinkedList class

        public static void main(String[] args) {
            singlyLinkedList l1 = new singlyLinkedList();
            l1.addContact("rahul", "11111111");
            l1.addContact("ritik", "11111111");
            l1.addContact("ritesh", "11111111");
            l1.addContact("rohan", "11111111");
            l1.displayContact();

            boolean result = l1.searchContact("rohan");
            if (result) {
                System.out.println("Contact found");
            } else {
                System.out.println("Contact not found");
            }

            l1.removeContact("rohan");
            l1.displayContact();


        }
    }
}
