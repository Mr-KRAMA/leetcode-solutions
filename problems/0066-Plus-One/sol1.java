// ==========================================================
// 66. Plus One
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43 MB (Beats 52%)
// Link       : https://leetcode.com/problems/plus-one/
// ==========================================================

class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;

        }

        int[] res = new int[n + 1];
        res[0] = 1;
        return res;

    }
}