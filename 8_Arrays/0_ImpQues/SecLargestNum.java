// Return the second largest number in array.

import java.util.*;;
public class SecLargestNum {

    // public static int secondLargestNum(int[] arr){
    //     Arrays.sort(arr);    // Will Arrang data in accending order
    //     return arr[arr.length - 2];
    // }
    // public static void main(String args[]){
    //     int[] arr = {3, 9, 5, 7, 4};
    //     System.out.println(secondLargestNum(arr));
    // }

    // public static int secondLargestNum(int[] arr){ //If Equal number then return integers min value "-2147483648"
    //     Arrays.sort(arr);
    //     for(int i=arr.length-1; i>0; i--){
    //         if(arr[i] != arr[i-1]){
    //             return arr[i-1];
    //         }
    //     }
    //     return Integer.MIN_VALUE;
    // }

    public static int secondLargestNum(int[] arr){ //If Equal number then return integers min value "-2147483648"
        Arrays.sort(arr); // Sorted array with increasing val (3, 4, 7, 9, 10)
        int max,secMax;
        max=secMax=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                secMax=max;
                max=x;
            } else {
                if(x>secMax && x!=max){
                    secMax=x;
                }
            }
        }
        return secMax;
    }
    public static void main(String args[]){
        int[] arr = {7, 9, 3, 4, 10};
        System.out.println(secondLargestNum(arr));
    }
} // This code will not work for the All same array number like - 6,6,6,6,6

