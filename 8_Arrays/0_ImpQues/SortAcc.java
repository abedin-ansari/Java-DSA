// You have been given an integer array of size 'N'. It only contains 0s 1s and 2s Write a solution
// To Sort this array.
// Try to solvw the problem in'single scan'. Single Scan refers to iterating over the array just once
// or to put it in other words, You will be reach each element in the array just once.

import java.util.Arrays;

public class SortAcc {
    public static void sortNum(int[] arr){
        int left=0, right= arr.length-1;
        int current = 0;
        int temp;
        while(current < right){
            if(arr[current] == 0){
                temp = arr[left];
                arr[left] = arr[current];
                arr[current] = temp;
                left++;
                current++;
            } else if(arr[current] == 2){
                temp = arr[right];
                arr[right] = arr[current];
                arr[current] = temp;
                right--;
            } else{
                current++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 2, 1, 0};
        sortNum(arr);
        System.out.println(Arrays.toString(arr));
    }
}
