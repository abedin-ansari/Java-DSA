// Question -> You have been given an array of size N. You need to swap every pair of alternate
// Elements in the arrayList.
// You Dont need to print or return anything Just change in the input array itself.

public class AlternateSwap {
    public static void main(String[] args) {
        int[] arr = {3, 6, 8, 5, 9, 2, 6};
        System.out.print("Before Swapping: ");
        for(int x:arr){
            System.out.print(x);
        }
        System.out.println();
        swapAlternate(arr);
        System.out.print("After Swapping: ");
        for(int x:arr){
            System.out.print(x);
        }
    }
    public static void swapAlternate(int[] arr){
        int temp;
        for(int i = 0; i < arr.length-1; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        
    }
}
