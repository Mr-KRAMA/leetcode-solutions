// ==========================================================
// 9. Palindrome Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 16 ms (Beats 17%)
// Memory     : 45.5 MB (Beats 71%)
// Link       : https://leetcode.com/problems/palindrome-number/
// ==========================================================

class Solution {
    public boolean isPalindrome(int x) {

         String xchar=x+"";
         char [] arr=xchar.toCharArray();

         int i=0;
         int j=arr.length-1;

         while (i<j){
        
        
                if(arr[i]!=arr[j]){
             return  false;
                }
    j--;
    i++;
                
            
         } 
        





return true;

 

    }
}