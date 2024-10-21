// Ques: You are Given an 'arr' Consisting of 'N' distinct Positive integers arranged in accending
// Order and also an integer 'Target' your task is to count all the distinct pair in 'arr' such that
// Their sum is equal to 'Target'.

import java.util.Scanner;

public class PairSum {
//    public static int pairSum(int[] arr, int target){
//     int count = 0;
//     int sum;
//     for(int i = 0; i < arr.length - 1; i++){
//         for(int j = i + 1; j < arr.length; j++){
//             sum = arr[i] + arr[j];
//             if(sum == target){
//                 ++count;
//             }
//         }
//     }
//     return count;
//    } 

      public static int betterPairSum(int[] arr, int target){
        int count = 0;
        int sum;
        int start=0, end=arr.length-1;
        while(start<end){
            sum = arr[start] + arr[end];
            if(sum == target){
                ++count;
                start++;
                end--;
            } else if(sum > target){
                end--;
            } else {
                start++;
            }
        }
        return count;
      }
   public static void main(String[] args) {
    int[] arr = {3, 5, 6, 8, 3};
    int target = 8;
    // System.out.println(pairSum(arr, target));
    System.out.println(betterPairSum(arr, target));
   }
}
