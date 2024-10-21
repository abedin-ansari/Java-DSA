import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(8);
        arr.add(3);
        arr.add(6);
        arr.add(5);

        System.out.println("Before sort: " + arr);
        Collections.sort(arr);
        System.out.println("After sort: " + arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Reverse Order: " + arr);
    }
}
