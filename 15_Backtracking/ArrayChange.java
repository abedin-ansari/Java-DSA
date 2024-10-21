public class ArrayChange {
    public static void changeArray(int[] arr, int i, int v){
        // Base Case (Step 1)
        
        if(i == arr.length){
            printArr(arr);
            return;
        }
        // Recursion (Kaam) (Step 2)

        arr[i] = v;
        changeArray(arr, i+1, v+1); // Fn calling step
        arr[i] = arr[i] - 2;  // BackTrack Step
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0, 1);
        printArr(arr);
    }
}