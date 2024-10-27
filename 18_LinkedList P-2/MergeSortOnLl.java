import java.util.LinkedList;

import org.w3c.dom.Node;

public class MergeSortOnLl {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergedLl = new Node(-1);
        Node temp = mergedLl;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLl.next;
    }

    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        // Find mid
        Node mid = getMid(head);

        // Left and right mergesort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }
    public void print() {
        // If the list is empty
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        // Traverse through the list and print each node's data
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null"); // End of the list
    }
    public static void main(String[] args) {
        // LinkedList<Integer> ll = new LinkedList<>();

        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addFirst(4);
        // ll.addFirst(3);

        // System.out.println(ll);

        // ll.head = ll.mergeSort(ll.head);
        // System.out.println(ll);

         MergeSortOnLl ll = new MergeSortOnLl();

        // Add elements to the custom linked list
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(4);
        ll.addFirst(3);

        System.out.println("Original List:");
        ll.print();

        // Perform merge sort
        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted List:");
        ll.print();
        
    }
}
