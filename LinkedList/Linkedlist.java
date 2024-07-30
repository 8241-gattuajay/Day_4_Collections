package LinkedList;

public class Linkedlist {

        static class Node {
            int data;
            Node next;

            Node(int newData) {
                data = newData;
                next = null;
            }
        }

        static Node insertAtFront(Node head, int newData) {
            Node newNode = new Node(newData);
            newNode.next = head;
            return newNode;
        }

        static void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            Node head = new Node(2);
            head.next = new Node(3);
            head.next.next = new Node(4);
            head.next.next.next = new Node(5);

            System.out.print("Original Linked List: ");
            printList(head);

            int newData = 1;
            head = insertAtFront(head, newData);

            System.out.print("After inserting at the front: ");
            printList(head);
        }
    }
