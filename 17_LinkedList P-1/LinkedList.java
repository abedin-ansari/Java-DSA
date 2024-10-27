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
        // If the index is 0, add the new node at the beginning
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
        // Handle edge case when list is empty
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            // Handle case with only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data; // Store data to return
        head = head.next; // Move head to the next node
        size--;
        return val;
    }

    public static int removeLast(){
        // Handle edge case when list is empty
        if(size == 0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            // Handle case with only one element
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head; // Traverse to the second last node
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data; // Store data to return
        prev.next = null; // Disconnect the last node
        tail = prev; // Update the tail to the second last node
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp = head; // Start from the head
        int i = 0; // Index tracker
        while(temp != null){
            // If the key is found, return the index
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++; // Move to the next node and increment index
        }
        return -1; // Key not found
    }

    public int helper(Node head, int key){ // O(n)
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key); // Recursive call to search the next node
        if(idx == -1){
            return -1; // Key not found
        }

        return idx+1; // Increment index if key is found
    }
    public int recSearch(int key){
        return helper(head, key); // Start the recursive search from head
    }

    public void reverse(){  // O(n) to reverse the list
        Node prev = null;
        Node curr = tail = head;
        Node next;

        // Reverse the pointers of the list
        while(curr != null){
            next = curr.next;
            curr.next = prev; // Reverse the link
            prev = curr;
            curr = next; // Move to the next node
        }
        head = prev; // Update head to the last node
    }
    
    public void deleteNthFromEnd(int n){
        // Calculate size of the LinkedList
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        // If the nth node from the end is the head
        if(n == sz){
            head = head.next; // Remove the head
            return;
        }

        // Find the node before the nth node from the end
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        // Skip the nth node
        prev.next = prev.next.next;
        return;
    }

    // Slow fast approach to find middle node
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        // Move fast pointer by two steps and slow by one step
        while(fast == null && fast.next == null){
            slow = head.next;
            fast = head.next.next;
        }
        return slow; // Slow is the mid-node
    }

    public boolean checkPalindrome(){
        // Base case: if the list is empty or has one element
        if(head == null || head.next == null){
            return true;
        }

        // Find middle node
        Node midNode = findMid(head);

        // Reverse the second half of the list
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev; // Reverse link
            prev = curr;
            curr = next;
        }

        Node right = prev; // Start of the reversed half
        Node left = head; // Start of the first half

        // Compare both halves
        while(right != null){
            if(left.data != right.data){
                return false; // Not a palindrome
            }
            left = left.next;
            right = right.next;
        }
        return true;
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
        System.out.println("null"); // End of the list
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList(); // Create a LinkedList instance

        // Test cases
        // ll.print();           // Expected: The list is empty
        ll.addFirst(3);       
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(2);        
        ll.addLast(1);        
        // ll.add(2, 3);
        ll.print();

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();

        // System.out.println("Key Found at index iterative approach: " + ll.itrSearch(3));
        // System.out.println("Key Found at index recursive approach: " + ll.recSearch(3));

        // System.out.println("LinkList Size: " + ll.size);

        // ll.reverse();
        // ll.print();

        // ll.deleteNthFromEnd(3);
        // ll.print();

        System.out.println(ll.checkPalindrome());
    }
}
