import java.util.*;

public class QueueReverse {

    // Method to reverse the elements of a queue
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        // Transfer elements from queue to stack
        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        // Transfer elements back from stack to queue
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        // Create a queue and add elements to it
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // Reverse the queue
        reverse(q);

        // Print the reversed queue
        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
    }
}
