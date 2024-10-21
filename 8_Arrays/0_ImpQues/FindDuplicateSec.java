// QUES -> Given an integer Arrays nums of length n where all the integer of nums are in the range of 
// [1, n-1] and each integers appears once but some integers appears twice Print all the numbers 
// which appeared twice.

public class FindDuplicateSec {
    public static void duplicateNum(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int x=Math.abs(arr[i]);
            if(arr[x] > 0){
                arr[x] = -arr[x];
            } else{
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 4, 5};
        duplicateNum(arr);
    }
}
