import java.util.ArrayList;

public class Add2Arrays {
    public static void main(String[] args) {
        int[] one = {3, 4, 7, 5, 9};
        int[] two = {6, 3, 8, 2};

        System.out.println(sumOfTwoArrays(one, two));

    }

    public static ArrayList<Integer> sumOfTwoArrays(int[] one, int[] two){
        ArrayList<Integer> answer = new ArrayList<>();

        int carry = 0;

        int i = one.length - 1;
        int j = two.length - 1;

        while(i >= 0 || j >= 0){

            int sum = 0;
            if(i >= 0){
                sum += one[i];
            }
            if(j >= 0){
                sum += two[j];
            }
            sum += carry;

            int rem = sum%10;
            carry = sum/10;

            answer.add(0, rem);
            i--;
            j--;
        }

        if(carry != 0){
            answer.add(0, carry);
        }
        return answer;

    }
}
