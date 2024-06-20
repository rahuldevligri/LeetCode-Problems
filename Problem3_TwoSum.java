public class Problem3_TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int[] arr = new int[2];
        int target = 9;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
    }
}
