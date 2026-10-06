
import java.util.Scanner;

class QueueManagement {
    int[] arr;
    int front;
    int rear;

    // constructor
    QueueManagement(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // add student
    void addStudent(int id) {
        // check queue is not full
        if (rear == arr.length - 1) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = id;
        }
    }

    int removeStudent() {
        if (rear == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            front++;
        }
        return arr[front - 1];
    }

    void displayStudent() {
        if (rear == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    void searchStudent(int id) {

        if (rear == -1 || front > rear) {

            System.out.println("Queue is empty");

        } else {
            for (int i = front; i <= rear; i++) {

                if (arr[i] == id) {

                    System.out.println("Student " + id + " is waiting");
                    return;
                }
            }

            System.out.println("Student " + id + " is not waiting");
        }
    }

    int CountStudent() {
        int count = 0;
        int trav = front;
        if (rear == -1 || front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = trav; i <= rear; i++) {
                count++;
            }
        }
        return count;
    }


}

public class StudentQueueManagement {

    public static int menu(){
        System.out.println("\n***** Student Queue MAnagement *****");
            System.out.println("1.Add student");
            System.out.println("2.Submit Assignemt");
            System.out.println("3.Search Student");
            System.out.println("4.Display Queue");
            System.out.println("5.Count Student");
            System.out.println("6.Exit");


            System.out.println("Enter your choice : ");
             Scanner sc = new  Scanner(System.in);
           int  choice = sc.nextInt();
           return choice;

    }
    static void main(String[] args) {

        QueueManagement q = new QueueManagement(5);
        int id;
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choice = menu();
            switch (choice) {
                case 0:
                    System.exit(0);

                case 1: // add student
                    System.out.println("Enter the Student Id ");
                    id = sc.nextInt();
                    q.addStudent(id);
                    System.out.println("Student " + id + " added in queue");
                    break;


                case 2: // delete student
                    int submittedStudent = q.removeStudent();
                    System.out.println("Submitted student assignment is : " + submittedStudent);
                    break;


                case 3: // search student
                    System.out.println("Enter the Student Id ");
                    id = sc.nextInt();
                    q.searchStudent(id);
                    break;

                case 4: // display queue

                    q.displayStudent();
                    break;
                case 5: // count student

                    int count = q.CountStudent();

                    System.out.println("total student : " + count);
                    break;

                default:
                    System.out.println("Invalid choice");


            }
        }
    }
}
