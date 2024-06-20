import java.util.*;

public class Problem3_usingHashMap {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 1;
        int[] result = Solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int check = target - nums[i];
            if (hm.containsKey(check)) {
                return new int[] { hm.get(check), i };
            }
            hm.put(nums[i], i);
        }
        return new int[1];
    }
}