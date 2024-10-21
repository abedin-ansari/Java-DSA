import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(7);
        arr.add(8);
        arr.add(5);
        arr.add(2);

        int max = Integer.MIN_VALUE;
        // int index = 0; // To track the index of the maximum value
        for(int i=0; i<arr.size(); i++){
            // if(max < arr.get(i)){
            //     max = arr.get(i);
            //     index = i; // For Index
            // }
            
            max = Math.max(max, arr.get(i));
        }
        System.out.println(max + " is Maximum");
    }
}
