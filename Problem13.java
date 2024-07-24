
/*
242. Valid Anagram
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word 
or phrase, typically using all the original letters exactly once.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        char[] a = s.toLowerCase().toCharArray();
        char[] b = t.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b))
            return true;
        return false;
    }
}

public class Problem13 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}
