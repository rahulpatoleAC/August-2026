public class browserHistory {
    public static class Node{
        String url;
        Node next;
        Node prev;
        Node(String url){
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }// end of Node class

    public static class doublyLinkedlist{
        Node current = null;
        Node head = null;
        Node tail = null;


        void visitPage(String url){
            Node newNode = new Node(url);
            if(head == null){
                head = newNode;
            }else{
                // Remove forward history
                current.next = null;
                tail = current;

                // add new page after current
                tail.next = newNode;
                newNode.prev = tail;
            }
            // update tail and current
                tail = newNode;
                current = newNode;
        }

        void moveBackward(){
            if(current == null){
                System.out.println("No browsing history");
            }else if(current.prev != null){
                current = current.prev;
                System.out.println("Moved to previous page : " + current.url);
            }else{
                System.out.println("There is no previous page");
            }
        }


        void moveForward(){
            if(current == null){
                System.out.println("No browsing history");
            }else if(current.next != null){
                current = current.next;
                System.out.println("Move to next page : " + current.url);
            }else{
                System.out.println("There is no next Page");
            }
        }

        void displayCurrentPage(){
            if(current == null){
                System.out.println("No browsing histroy");
            }else{
                System.out.println("Current page: " + current.url);
            }
        }


        void clearHistory(){
            Node trav = head;
            while(trav != null){
                Node nextNode = trav.next; // remember where to go
                trav.prev = null;
                trav.next = null; // disconnect current
                trav = nextNode;  // go to remembered node
            }

            head = null;
            tail = null;
            current = null;
        }

    }// end of class doubly linked list

    public static void main(String[] args){
        doublyLinkedlist page = new doublyLinkedlist();
        page.visitPage("google");
        page.visitPage("youtube");
        page.visitPage("github");
        page.visitPage("facebook");

        page.displayCurrentPage();
        page.moveBackward();
        page.clearHistory();
        page.displayCurrentPage();
    }

}
