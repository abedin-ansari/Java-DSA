// public class Que_2 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4};

//         rotate(arr);
//     }

//     public static void rotate(int[] arr, int k){
//         k = k % length;
//         if(k < 0){
//             k = k + arr.length;
//         }
//         for(int i =0; i <= k; i++){
//             int temp = arr[arr.length - 1];
//             for()
//             arr[i] = arr[i+1];
//         }
//     }
// }

public class Que_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 3; // specify the number of rotations
        rotate(arr, k);

        System.out.println("After " + k + " time Rotation: ");
        
        // Print the rotated array using a traditional for loop
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int k){
        int length = arr.length;
        k = k % length; // Ensure k is within the bounds of the array length
        if (k < 0) {
            k = k + length; // Handle negative rotations
        }

        // Rotate the array to the right by k positions
        // Step 1: Reverse the entire array
        reverse(arr, 0, length - 1);
        // Step 2: Reverse the first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse the remaining elements from k to end
        reverse(arr, k, length - 1);
    }

    // Helper method to reverse a portion of the array
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
