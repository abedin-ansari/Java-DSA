public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        printArr(arr);

    }
    public static void bubbleSort(int[] arr){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int j = 0; j < arr.length - 1; j++){     // current elem.
                if(arr[j] > arr[j+1]) {                   // (if 5 > 4)
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.err.println();
    }
}
