// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 80%)
// Memory     : 43.6 MB (Beats 94%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================

class Solution {
    public boolean isPalindrome(String s) {

if(s.isEmpty()){
    return true ;
}

int start=0;
int last=s.length()-1;

while(start<=last){
    char curF=s.charAt(start);
    char curL=s.charAt(last);
    if(!Character.isLetterOrDigit(curF)){
        start++;

    }else if (!Character.isLetterOrDigit(curL)){
        last--;
    }else{
        if(Character.toLowerCase(curF)!=Character.toLowerCase(curL)){
            return false;
        }
        start++;
        last --;
    }
   
}

 return true;

        

    }
 
    
}