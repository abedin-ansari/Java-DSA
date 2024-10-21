public class SumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; // Example input
        int[] result = runningSums(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] runningSums(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }

        return result;
    }
}
