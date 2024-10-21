public class ArrayReversal {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Before Reversal: ");
        display(numbers);
        reverse(numbers);
        System.out.println("After Reversal: ");
        display(numbers);

    }
    public static void display(int[] numbers){

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }

    public static void reverse(int[] numbers){

        int i = 0;
        int j = numbers.length - 1;

        while(i <= j){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

            i++;
            j--;
        }
    }
}
