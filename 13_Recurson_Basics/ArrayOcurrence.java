public class ArrayOcurrence {
    public static int firstOcurrence(int[] arr, int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcurrence(arr, key, i+1);
    }

    public static int lastOcurrence(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcurrence(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        } 
        return isFound;
    }
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 8, 5, 9, 4};
        int key = 9;
        System.out.println("firstOcurrence: " + firstOcurrence(arr, key, 0));
        System.out.println("lastOcurrence: " + lastOcurrence(arr, key, 0));
    }
}
