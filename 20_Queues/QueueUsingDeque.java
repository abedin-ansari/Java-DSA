import java.util.*;
import java.util.LinkedList;

public class QueueUsingDeque {
    static class Queue {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty() {
            return deque.isEmpty();
        }

        public static void add(int data) {
            deque.addLast(data);
        }

        public static int remove() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.removeFirst();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
