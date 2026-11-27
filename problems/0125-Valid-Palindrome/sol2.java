// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 4 ms (Beats 45%)
// Memory     : 44.7 MB (Beats 39%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================

class Solution {
    public boolean isPalindrome(String s) {

// Sol 2  

StringBuilder cleaned = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        
        String forward = cleaned.toString();
        String backward = cleaned.reverse().toString();
        
        return forward.equals(backward);







// Optimise Solution  

// if(s.isEmpty()){
//     return true ;
// }

// int start=0;
// int last=s.length()-1;

// while(start<=last){
//     char curF=s.charAt(start);
//     char curL=s.charAt(last);
//     if(!Character.isLetterOrDigit(curF)){
//         start++;

//     }else if (!Character.isLetterOrDigit(curL)){
//         last--;
//     }else{
//         if(Character.toLowerCase(curF)!=Character.toLowerCase(curL)){
//             return false;
//         }
//         start++;
//         last --;
//     }
   
// }

//  return true;

        

    }
 
    
}