import java.util.*;

public class LinkedList {

    // Node class represents each element in the LinkedList
    public static class Node {
        int data; // The value stored in the node
        Node next; // Reference to the next node

        // Constructor to create a new node with the given data
        public Node(int data) {
            this.data = data;
            this.next = null; // 'next' is initially null since the node isn't linked yet
        }
    }

    // 'head' is the first node, and 'tail' is the last node of the LinkedList
    public static Node head;
    public static Node tail;
    public static int size;

    // Adds a new node at the beginning of the LinkedList
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node
        size++;
        
        // If the list is empty, newNode becomes both head and tail
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link the new node to the current head and update head
        newNode.next = head;
        head = newNode;
    }

    // Adds a new node at the end of the LinkedList
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node
        size++;
        
        // If the list is empty, newNode becomes both head and tail
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link the current tail to the new node and update the tail
        tail.next = newNode;
        tail = newNode;
    }

    public void add(int idx, int data) {

        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data); // Create a new node with the given data
        size++;
        Node temp = head; // Start from the head of the LinkedList
        int i = 0; // Counter to track current position
    
        // Traverse to the node just before the target index (idx - 1)
        while(i < idx - 1) {
            temp = temp.next; // Move to the next node
            i++; // Increment the counter
        }
    
        // Link the new node to the next node at index `idx`
        newNode.next = temp.next; // newNode points to the node currently at index `idx`
    
        // Link the previous node (at idx - 1) to the new node
        temp.next = newNode; // temp (at idx - 1) now points to the new node
    } 

    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key){ // O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){  // 0(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }


    public void deleteNthFromEnd(int n){
        // calC size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n == sz){
            head = head.next; // rem size
            return;
        }

        // sz-1
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // Prints the entire LinkedList
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
        System.out.println("null"); // Newline after printing all nodes
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create a LinkedList instance

        // Test cases
        ll.print();           // Expected: The list is empty
        ll.addFirst(4);       // Add 2 at the beginning
        ll.addFirst(2);       // Add 1 at the beginning
        ll.addFirst(1); 
        ll.addLast(5);        // Add 3 at the end
        ll.addLast(6);        // Add 4 at the end
        ll.add(2, 3);
        ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        System.out.println("Key Found at index iterative approach: " + ll.itrSearch(3));
        System.out.println("Key Found at index recursive approach: " + ll.recSearch(3));

        System.out.println("LinkList Size: " + ll.size);

        // ll.reverse();
        // ll.print();

        ll.deleteNthFromEnd(3);
        ll.print();
    }
}
