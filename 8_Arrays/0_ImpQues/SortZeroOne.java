// You have given an integer array of size 'N' That contains only integers only, 0 and 1.
// Write a Function to sort this array.
// Think of the solution which scans the array only once and doesnt require use of an extra array.

import java.util.Arrays;

public class SortZeroOne {
    // public static void sortNum(int[] arr){
    //     int left=0, right=arr.length-1;
    //     int temp;
    //     while(left < right){
    //         if(arr[left] == 1){
    //             if(arr[right] != 1){
    //                 temp = arr[left];
    //                 arr[left] = arr[right];
    //                 arr[right] = temp;
    //             }
    //             right--;
    //         } else {
    //             left++;
    //         }
    //     }
    // }
    public static void betterSortNum(int[] arr){
        int left = 0, right = arr.length-1;
        while(left<right){
            if(arr[left] == 1){
                if(arr[right] != 1){
                    arr[left] = arr[right];
                    arr[right] = 1;
                }
                right--;
            } else{
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 0};
        // sortNum(arr);
        betterSortNum(arr);
        System.out.println(Arrays.toString(arr));
    }
}