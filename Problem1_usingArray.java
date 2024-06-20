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

public class Problem1_usingArray {
    public static void main(String[] args) {
        int[] arr1 = { 28, 6, 22, 8, 44, 17 }, arr2 = { 22, 28, 8, 6 };
        int cnt = 0;

        for (int j = 0; j < arr2.length; j++) {
            for (int k = 0; k < arr1.length; k++) {
                if (arr2[j] == arr1[k]) {
                    int temp = arr1[cnt];// temp = 28 |temp = 6 |temp = 6 |temp = 6
                    arr1[cnt] = arr1[k];// arr1[0] = 22 | arr1[1] = 28 |arr1[2] = 8 |arr1[3] = 6
                    arr1[k] = temp;// arr1[2] = 28 | arr1[2] = 6 arr1[3] = 6 |arr1[3] = 6
                    cnt++;// 1, 2, 3, 4
                }
            }
        }

        for (int i = cnt; i < arr1.length - 1; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[j];// temp = 17
                    arr1[j] = arr1[i];// arr1[5] = 44
                    arr1[i] = temp;// arr1[4] = 17
                }
            }
        }

        for (int i : arr1) {
            System.out.print(i + " ");
        }

    }
}