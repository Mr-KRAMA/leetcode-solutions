// ==========================================================
// 49. Group Anagrams
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 83%)
// Memory     : 48.9 MB (Beats 95%)
// Link       : https://leetcode.com/problems/group-anagrams/
// ==========================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     
    Map <String,List<String>>map=new HashMap<>();
    for(String str:strs){
        char[]  chars=str.toCharArray();
        Arrays.sort(chars);

        String  key =new String(chars);

        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        map.get(key).add(str);
    }
     
      return new ArrayList<>(map.values());



    }
}