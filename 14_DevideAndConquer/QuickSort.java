public class QuickSort {
    public static void printArr(int arr[]){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int partition(int[] arr, int stri, int endi){
        int pivot = arr[endi];
        int i = stri-1; // To make Place for Elements smaller then pivot

        for(int j=stri; j < endi; j++){
            if(arr[j] <= pivot){
              i++;
              // For left items becouse indx is smaller then pivot
              int temp = arr[j];
              arr[j] = arr[i];
              arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[endi] = arr[i]; // pivot = arr[i]
        arr[i] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int stri, int endi){
        if(stri >= endi){
            return;
        }

        // Last Element
        int pivotIndx = partition(arr, stri, endi);
        quickSort(arr, stri, pivotIndx-1); // For left of pivot
        quickSort(arr, pivotIndx+1, endi);  // For right of pivot
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 8, 2, 5};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
