import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] one = {24, 39, 47, 56};       // It should be SORTED DATA***
        int[] two = {39, 44, 47, 58};

        System.out.println(intersection(one, two));
    }
    public static ArrayList<Integer> intersection(int[] one, int[] two){
        ArrayList<Integer> answer = new ArrayList<>();

        int i = 0;
        int j = 0;

        while(i < one.length && j < two.length){

            if(one[i] < two[j]) {
                i++;
            } else if(one[i] > two[j]) {
                j++;
            } else {
                answer.add(one[i]);
                i++;
                j++;
            }
        }
        return answer;
    }
}
