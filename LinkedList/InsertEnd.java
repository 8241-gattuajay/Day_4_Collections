package LinkedList;

public class InsertEnd {

        static class Node {
            int data;
            Node next;

            Node(int newData) {
                data = newData;
                next = null;
            }
        }

        static Node append(Node head, int newData) {
            Node newNode = new Node(newData);
            if (head == null) {
                return newNode;
            }
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            return head;
        }

        static void printList(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
        }

        public static void main(String[] args) {
            Node head = new Node(2);
            head.next = new Node(3);
            head.next.next = new Node(4);
            head.next.next.next = new Node(5);

            System.out.print("Original Linked List: ");
            printList(head);

            int newData = 1;
            head = append(head, newData);

            System.out.print("\nAfter inserting 1 at the end: ");
            printList(head);
        }
    }
