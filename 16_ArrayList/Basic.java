import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // ADD ELEMENT ( Time Complexity - O(1) )
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // Another ADD ELEMENT which takes linear time O(n) 
        list.add(1, 6);
        System.out.println("After added 6 on Index 1: " + list);

        // GET ELEMENT ( Time Complexity - O(1) )

        int element = list.get(2); // 2nd Index
        System.out.println("Get Element: " + element);

        // Remove Element ( Time Complexity - O(n) )

        list.remove(2);
        System.out.println("Remove Element: " + list);

        // Set Elem at Index ( Time Complexity - O(n) )
        list.set(2, 10); // On 2 Elem 10 value setted
        System.out.println("Set Elem: " + list);

        // Contains Elem ( Time Complexity - O(n) )
        System.out.println(list.contains(10) ? "yes Number is available: " + list.contains(10) : "Not Available: " + list.contains(10));
        System.out.println(list.contains(11)  ? "yes Number is available in the ArrayList: " + list.contains(11) : "Not Available: " + list.contains(11));
    }
}
