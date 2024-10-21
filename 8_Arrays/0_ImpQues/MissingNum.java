public class MissingNum {
    public static int missing(int[] nums){
        int sum =0;
        for(int i =0; i <nums.length; i++){
            sum = sum + nums[i];
        }
        int actualSum = nums.length * (nums.length + 1) / 2;
        int missing = actualSum - sum;
        return missing;
    }
    public static void main(String[] args) {
        int[] num = {0, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(missing(num));
    }
}
