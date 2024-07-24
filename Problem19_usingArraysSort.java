/*
215. Kth Largest Element in an Array
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 */

import java.util.Arrays;

public class Problem19_usingArraysSort {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;

        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }

}
