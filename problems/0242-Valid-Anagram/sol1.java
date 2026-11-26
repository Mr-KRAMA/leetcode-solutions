// ==========================================================
// 242. Valid Anagram
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 88%)
// Memory     : 45.8 MB (Beats 47%)
// Link       : https://leetcode.com/problems/valid-anagram/
// ==========================================================

class Solution {
    public boolean isAnagram(String s, String t) {
    
    if(s.length()!=t.length()){
        return false;
    }

  char[] sArr=s.toCharArray();
  char[] tArr=t.toCharArray();
  Arrays.sort(sArr);
  Arrays.sort(tArr);
  return Arrays.equals(sArr,tArr);
 
    
  



    }
}