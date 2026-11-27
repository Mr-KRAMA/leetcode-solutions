// ==========================================================
// 58. Length of Last Word
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.8 MB (Beats 47%)
// Link       : https://leetcode.com/problems/length-of-last-word/
// ==========================================================

class Solution {
    public int lengthOfLastWord(String s) {
       s=s.trim();

       int len=0;
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!=' '){
            len++;
            
        }else{
            break;
        }
       }
       return len;
    }
}
