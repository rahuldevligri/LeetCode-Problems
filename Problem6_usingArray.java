/*
9. Palindrome Number - Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int newnum = 0;
        int num = x;
        int mod = 0;
        while (num > 0) {
            mod = num % 10;
            newnum = newnum * 10 + mod;
            num /= 10;
        }
        if (x == newnum) {
            return true;
        } else {
            return false;
        }
    }
}

public class Problem6_usingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        Solution sol = new Solution();

        if (sol.isPalindrome(num) == true) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
