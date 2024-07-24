/*
58. Length of Last Word
Given a string s consisting of words and spaces, return 
the length of the last word in the string.A word is a 
maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
*/
public class Problem17 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {
        // Trim the string to remove leading and trailing spaces
        System.out.println(s);
        s = s.trim();
        System.out.println(s);

        // Find the index of the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        System.out.println(lastSpaceIndex);

        // The length of the last word is the length of the string
        // minus the index of the last space minus one (for the space itself)
        return s.length() - lastSpaceIndex - 1;
    }
}
