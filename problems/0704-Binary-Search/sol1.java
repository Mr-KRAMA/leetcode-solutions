// ==========================================================
// 704. Binary Search
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47.5 MB (Beats 97%)
// Link       : https://leetcode.com/problems/binary-search/
// ==========================================================

class Solution {
    public int search(int[] nums, int target) {
        
 
            int start =0;
            int end =nums.length-1;

            while (start <=end){
                 int mid =start +(end -start)/2;

                 if(nums[mid]==target){
                    return mid ;
                 }else if (nums[mid]<target){
                    start=mid+1; 
                 }else{
                    end =mid-1;
                 }
                 
            }
            return -1;
    }
  



    
}