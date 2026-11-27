// ==========================================================
// 136. Single Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 13 ms (Beats 20%)
// Memory     : 46.2 MB (Beats 88%)
// Link       : https://leetcode.com/problems/single-number/
// ==========================================================

class Solution {
    public int singleNumber(int[] nums) {
        
     Map<Integer,Integer>map=new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }
     for(Map.Entry<Integer,Integer>entry:map.entrySet()){
         if(entry.getValue()==1){
            return entry.getKey();
         }
     }

     return -1;


    }
}