// ==========================================================
// 242. Valid Anagram
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 17 ms (Beats 21%)
// Memory     : 45.3 MB (Beats 49%)
// Link       : https://leetcode.com/problems/valid-anagram/
// ==========================================================

class Solution {
    public boolean isAnagram(String s, String t) {


// using hashmap 

if(s.length()!=t.length()){
    return false;
}
Map<Character,Integer>map=new HashMap<>();


for(int i=0;i<s.length();i++){
    char c =s.charAt(i);
    map.put(c,map.getOrDefault(c,0)+1);
}
for(int i=0;i<t.length();i++){
    char c =t.charAt(i);
    if(!map.containsKey(c)|| map.get(c)==0){
        return false;
    }
    map.put(c,map.get(c)-1);
}
return true;











//     if(s.length()!=t.length()){
//         return false;
//     }

//   char[] sArr=s.toCharArray();
//   char[] tArr=t.toCharArray();
//   Arrays.sort(sArr);
//   Arrays.sort(tArr);
//   return Arrays.equals(sArr,tArr);
 
    
  



    }
}