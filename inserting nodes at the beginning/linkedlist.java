import java.util.*;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    // inserting nodes at the the beginning of the linked list
    public void creation() {
        int i = 0;
        while (i < 1) {
            System.out.print("Enter data of Node: ");
            int data = new Scanner(System.in).nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            }

            else {
                new_node.next = head;
                head = new_node;
            }

            System.out.println();
            System.out.println("Enter 'Y' or 'Y' for inserting more Nodes and 'N' or 'n' for break");
            char ch = new Scanner(System.in).next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                System.out.println("Add another Node");
            }

            else if (ch == 'N' || ch == 'n') {
                break;
            }

            else {
                break;
            }
        }
    }

    // Traversing LinkedList
    public void Traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + ",");
            temp = temp.next;
        }
    }
}
