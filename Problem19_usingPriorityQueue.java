
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
import java.util.PriorityQueue;

public class Problem19_usingPriorityQueue {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 3, 4, 2, 7, 8 };
        int k = 3;

        // Create a Min-Heap (PriorityQueue) with initial capacity of k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Iterate through the array
        for (int num : nums) {
            // Add the current number to the heap
            minHeap.offer(num);

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        // The root of the heap is the kth largest element
        System.out.println(minHeap.peek());
    }
}
