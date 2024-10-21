// QUES -> You have been given an integer array ARR of size N Which contains numbers from 0 to (N - 2).
// Each number is present atleast once. that is if N=5 then the value in array will be from 0 to 3
// and among these, there is a single integer value that is present twice You need to find that 
// Duplicate Number Present in the array.

import java.util.Arrays;

public class FindDuplicate {
    // 2nd Solution
    public static void doubleInt(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 3, 6};
        FindDuplicate.doubleInt(arr);

        // First Solution
        // for(int i = 0; i < arr.length-1; i++){
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             System.out.println(arr[j]);
        //         }
        //     }
        // }
    }
}