import java.util.ArrayList;

public class Swap {
    public static void swap(ArrayList<Integer> arr, int idx, int idx2){
        int temp = arr.get(idx);
        arr.set(idx, arr.get(idx2));
        arr.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(8);
        arr.add(6);
        arr.add(4);
        arr.add(10);

        System.out.println("before Swap: " + arr);
        int idx = 1, idx2 = 3;
        swap(arr, idx, idx2);
        System.out.println("After Swap: " + arr);
    }
}
