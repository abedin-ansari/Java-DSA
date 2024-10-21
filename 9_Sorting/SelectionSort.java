public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 1, 2};
        selectionSort(nums);
        printArr(nums);
    }
    public static void selectionSort(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            int minPos = i;
            for(int j = i+1; j < nums.length; j++){
                if(nums[minPos] > nums[j]){
                minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
    public static void printArr(int[] nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
        System.err.println();
    }
}
