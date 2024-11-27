/**
 * A Doubly Linked List (DLL) is a type of linked list in which each node contains three parts:
 * 1. Data: The value stored in the node.
 * 2. Next Pointer: A reference to the next node in the list.
 * 3. Previous Pointer: A reference to the previous node in the list.
 * 
 * In a Doubly Linked List, traversal is possible in both forward and backward directions,
 * making it more flexible than a singly linked list.
 */

 public class DoublyLl {

    // Definition of a Node in a Doubly Linked List
    public class Node {
        int data; // Data stored in the node
        Node next; // Pointer to the next node
        Node prev; // Pointer to the previous node

        // Constructor to initialize a new node
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Head points to the first node, tail to the last node in the list
    public static Node head;
    public static Node tail;
    public static int size; // Tracks the size of the doubly linked list

    /**
     * Adds a new node with the specified data at the beginning of the list.
     * Doubly Linked List ensures each node links to the next and previous nodes.
     */
    public void addFirst(int data){
        Node newNode = new Node(data); // Create a new node
        size++; // Increment the size
        if(head == null){ // If the list is empty
            head = tail = newNode; // Both head and tail point to the new node
            return;
        }

        // Link the new node to the current head and update the head pointer
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /**
     * Adds a new node with the specified data at the end of the list.
     */
    public void addLast(int data){
        Node newNode = new Node(data); // Create a new node
        size++; // Increment the size
        if(head == null){ // If the list is empty
            head = tail = newNode; // Both head and tail point to the new node
            return;
        }

        // Link the new node to the current tail and update the tail pointer
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Prints all the elements of the doubly linked list.
     * Each node's data is printed along with its link to the next node.
     */
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->"); // Print data of each node
            temp = temp.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }

    /**
     * Removes and returns the first node of the list.
     */
    public int removeFirst(){
        if(head == null){ // If the list is empty
            System.out.println("Ll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){ // If there is only one element
            int val = head.data; // Store the data
            head = tail = null; // Empty the list
            size--;
            return val;
        }
        int val = head.data; // Store the data to return
        head = head.next; // Move head to the next node
        head.prev = null; // Remove link to the old head
        size--;
        return val;
    }

    /**
     * Removes and returns the last node of the list.
     */
    public int removeLast(){
        if(head == null){ // If the list is empty
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){ // If there is only one element
            int val = tail.data; // Store the data
            head = tail = null; // Empty the list
            size--;
            return val;
        }
        int val = tail.data; // Store the data to return
        tail = tail.prev; // Move tail to the previous node
        tail.next = null; // Remove link to the old tail
        size--;
        return val;
    }

    /**
     * Reverses the doubly linked list.
     * Swaps the next and previous pointers of all nodes to reverse their direction.
     */
    public void reverse(){
        Node curr = head;
        Node prev = null; // Initialize previous node as null
        Node next;

        while (curr != null) {
            next = curr.next; // Store reference to the next node
            curr.next = prev; // Reverse the next pointer
            curr.prev = next; // Reverse the prev pointer

            prev = curr; // Move prev to current
            curr = next; // Move current to next
        }
        head = prev; // Update head to the last node
    }

    public static void main(String[] args) {
        DoublyLl dll = new DoublyLl();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.print();

        // dll.removeFirst();
        // dll.print();

        // dll.removeLast();
        // dll.print();

        dll.reverse();
        dll.print();
        System.out.println("size: "+ dll.size);
    }
}
