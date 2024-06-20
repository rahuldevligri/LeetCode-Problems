
/*
 Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Example 2:
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]
*/
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class Problem1_usingMap {
    public static void main(String[] args) {
        int[] arr1 = { 28, 6, 22, 8, 44, 17 }, arr2 = { 22, 28, 8, 6 };
        Map<Integer, Integer> lhm = new LinkedHashMap<>();
        List<Integer> al = new ArrayList<>();

        // Initialize lhm map with relative order elements
        for (int key : arr2) {
            lhm.put(key, 0);
        }

        // Count occurrences of elements in target array
        int cnt = 0;
        for (int key : arr1) {
            if (lhm.containsKey(key)) {
                lhm.put(key, lhm.get(key) + 1);
                cnt++;
            } else {
                lhm.put(key, 1);
            }
        }

        // add map elements into list
        for (Map.Entry<Integer, Integer> entry : lhm.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                al.add(entry.getKey());
            }
        }

        // Sort the remaining elements
        for (int i = cnt; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(j);// temp = 7
                    al.set(j, al.get(i));// al.get(10) = 19
                    al.set(i, temp);
                }
            }
        }
        System.out.println(al);
    }
}
