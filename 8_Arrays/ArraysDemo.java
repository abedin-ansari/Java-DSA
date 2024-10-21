// pring arrays value thrue loop.

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40 ,50};

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);        // for printing the data inaccending order
        // }

        for(int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);          // print element from end to start
        }

    }
}
