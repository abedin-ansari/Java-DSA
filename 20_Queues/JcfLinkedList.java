import java.util.*;

// Note: Queue can be implemented using LinkedList or ArrayDeque in Java
// Queue<Type> queue = new LinkedList<>(); or Queue<Type> queue = new ArrayDeque<>();
public class JcfLinkedList {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}