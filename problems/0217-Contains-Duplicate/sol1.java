// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 13 ms (Beats 99%)
// Memory     : 108.8 MB (Beats 13%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();

        for(  int n:nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;


            // for(int i=0;i<nums.length;i++){
            //     for(int j=i+1;j<nums.length;j++){
            //         if(nums[i]==nums[j]){
            //             return true;
            //         }
            //     }
            // }
            // return false;
    

    }
}