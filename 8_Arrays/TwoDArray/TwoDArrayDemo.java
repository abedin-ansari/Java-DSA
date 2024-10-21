public class TwoDArrayDemo {

    public static void main(String[] args) {
        int[][] arr = new int[3][4];

        int[][] arr1 = {
            {1, 2, 6},
            {2, 3, 8},
            {4, 5, 7}
        };

        System.out.println(arr);
        System.out.println(arr[0]);  // These will be print the addresses of thr array
        System.out.println(arr[1]);

        System.out.println(arr.length); // print Row(3).
        System.out.println(arr[0].length); // print Column(4).

        // Access array value
        System.out.println(arr[0][1]);  // initially its value currently is "0".

        // Set
        arr[0][1] = 50;               // it sets the value from 0 to 50 of that particular element.
        System.out.println(arr[0][1]);


        // now aceess and pring the values of arr1
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[0].length; j++){
                System.out.print(arr1[i][j] + ", ");
            }
            System.out.println();
        }
    }
}