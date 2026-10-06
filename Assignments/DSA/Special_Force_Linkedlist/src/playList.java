import javax.lang.model.element.NestingKind;
import java.text.AttributedCharacterIterator;

public class playList {

    public static class Node{
        String title;
        String artist;
        Node next;
        Node prev;
        Node(String title,String artist){
            this.title = title;
            this.artist = artist;
            this.next = null;
            this.prev = null;
        }
    }// end of the class Node

    public static class CircularLinkedList{
        Node head = null;
        Node tail = null;
        Node current = null;

        // add song at last
        void addSong(String title, String artist){
            Node newNode = new Node(title,artist);

            if(head == null){
                head = newNode;
            }else{
                tail.next = newNode;
            }
            tail = newNode;
            tail.next = head;
            current = newNode;
        }

        // remove a song by title
        void removeSong(String title){
            // 1. list is empty
            if(head == null){
                System.out.println("List is empty");
                return;
            }

            // 2.only one song
            if(head.next == head){
                if(head.title.equalsIgnoreCase(title)){
                    head = null;
                    tail = null;
                    current = null;
                    System.out.println("Song removed : " + title);
                }else{
                    System.out.println("Song not found");
                }
                return;
            }

            // 3.removing the head song
            if(head.title.equalsIgnoreCase(title)){
                head = head.next;
                tail.next = head;

                // If the current was song being removed
                current = head;
                System.out.println("Song removed : " + title);
                return;
            }

            // 4. search for song after head
            Node trav = head;

            while(trav.next != head){
                if(trav.next.title.equalsIgnoreCase(title)){
                    //removing the tail
                    if(trav.next==tail){
                        tail = trav;
                    }
                    //remove the song
                    trav.next = trav.next.next;
                    // maintain circular connection
                    tail.next = head;
                    //if current was the removed song
                    if(current.title.equalsIgnoreCase(title)){
                        current = head;
                    }

                    System.out.println("Song removed : " + title);
                    return;
                }
                trav = trav.next;
            }

            // 5. Song was not found
            System.out.println("Song not found : " + title);
        }

        // move to next song
        void playNext(){
            if(current == null){
                System.out.println("Playlist is empty");
                return;
            }else{
                current = current.next;
                System.out.println("Now Playing: " + current.title + "by" + current.artist);
            }
        }

        // move to the previous song
        void playPrevious() {
            if (current == null) {
                System.out.println("Playlist is empty");
                return;
            } else {
                Node trav = head;
                while (trav.next != current) {
                    trav = trav.next;
                }
                current = trav;
            }
        }

        // display current song
        void displayCurrentSong(){
            if(current == null){
                System.out.println("List is empty");
                return;
            }else{
                System.out.println("Now playing : " + current.title + " by " + current.artist );
            }
        }


    }// end of the class circular linked list
    public static void main(String[] args){
        CircularLinkedList s1 = new CircularLinkedList();
        s1.addSong("Kal ho na ho","Sonu Nigam");
        s1.displayCurrentSong();
//        s1.addSong("");

        s1.playNext();
        s1.displayCurrentSong();

    }

}
