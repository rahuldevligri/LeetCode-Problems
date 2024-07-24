/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid. An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
*/
public class Problem14 {
    public static void main(String[] args) {
        String s = "(]";
        Solution solution = new Solution();
        System.out.println(solution.isValid(s));
    }
}

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i += 2) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) != ')') {
                return false;
            } else if (s.charAt(i) == '[' && s.charAt(i + 1) != ']') {
                return false;
            } else if (s.charAt(i) == '{' && s.charAt(i + 1) != '}') {
                return false;
            }
        }
        return true;
    }
}