//--> the swap program here will not be done becouse the `swap` method will only modify the local copies
// of one and two and will not affect the original variables in the main method.

//--> Java Always work as "pass by value" ( not as c++ which also supports "pass by reference".)

public class Swapping {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;

        System.out.println("Before Swapping: " + "one:" + one + " two:" + two);

        swap(one, two);
        System.out.println("After Swapping: " + "one:" + one + " two:" + two);
    }
    public static void swap(int one, int two){

        int temp = one;
        one = two;
        two = temp;
        System.out.println("After Swapping: " + "one:" + one + " two:" + two);
    }
}
