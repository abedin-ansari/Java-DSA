import java.util.*;
import java.util.LinkedList;

// Logic: Implements Stack using Deque where push/pop/peek operations are performed at the last end
public class StackUsingDeque {
    static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static boolean isEmpty() {
            return deque.isEmpty();
        }

        public static void push(int data) {
            deque.addLast(data); 
        }

        public static int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeLast();
        }

        public static int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();  // Removed generic type as Stack class isn't generic
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}

