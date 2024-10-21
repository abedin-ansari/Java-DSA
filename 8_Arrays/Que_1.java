// for finding the minimun number in array

public class Que_1 {
    public static void main(String[] args) {
        int[] arr = {4, 6 ,8 ,3, 5};

        // minElement(arr);
        maxElement(arr);
    }

    // public static void minElement(int[] arr){

    //     int min = Integer.MAX_VALUE;
    //     //or
    //     // int min = arr[0];

    //     for(int i = 0; i < arr.length; i++){
    //        if(arr[i] < min){
    //         min = arr[i];
    //        }
    //     }
    //     System.out.println(min);
    // }

    public static void maxElement(int[] arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
