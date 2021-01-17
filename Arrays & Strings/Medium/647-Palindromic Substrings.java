class Solution {
    int count = 0;

    public int countSubstrings(String s) {
        if (s.length() == 0)
            return 0;

        for (int i = 0; i < s.length(); i++) {
            checkpalindrome(s, i, i); // odd
            checkpalindrome(s, i, i + 1); // even
        }

        return count;

    }

    public void checkpalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
    }
}
// medium
// time: O(n^2)
// space: O(1) - iterating on input string
//