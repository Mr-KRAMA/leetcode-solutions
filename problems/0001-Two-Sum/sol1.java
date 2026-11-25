// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 44 ms (Beats 33%)
// Memory     : 46.5 MB (Beats 83%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

 

public class Solution {
    public int[] twoSum(int[] nums, int target) {
      
       for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int [] {i,j};
            }
        }
       }
    return new int[]{};




} 


}