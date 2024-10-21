public class MergeSort {
    public static void printArr(int[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr, int stri, int endi){
        if(stri >=endi){
            return;
        }
        int mid = (stri + endi) / 2;
        mergeSort(arr, stri, mid);
        mergeSort(arr, mid+1, endi);

        merge(arr, stri, mid, endi);
    }
    public static void merge(int[] arr, int stri, int mid, int endi){
        int[] temp = new int[endi-stri+1]; // IMP
        int i = stri; // Idx for first sorted part
        int j = mid + 1; // Idx for second sorted part
        int k = 0; // idx for Temp

        while(i <= mid && j <= endi){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            } else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        
        // For firstover elements of 1st sorted part 
        while(i <= mid){
            temp[k++] = arr[i++];
        }
         // For lastover elements of 2nd sorted part 
        while(j <= endi){
            temp[k++] = arr[j++];
        }

        for(k = 0, i=stri; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
