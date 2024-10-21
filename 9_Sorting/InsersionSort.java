public class InsersionSort {
    public static void main(String[] args) {
        int[] arr = {4, 2, 10, 8, 6};
        insersion(arr);
        printArr(arr);
    }
    public static void insersion(int[] arr){
        for(int i = 1; i < arr.length; i++){
          int curr = arr[i];
          int prev = i - 1;
          // Finding out current position to insert.
          while(prev >=0 && arr[prev] > curr){
            arr[prev + 1] = arr[prev];
            prev--;
          }
          // Insertion
          arr[prev+1] = curr;
        }
    }
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.err.println();
    }
}
