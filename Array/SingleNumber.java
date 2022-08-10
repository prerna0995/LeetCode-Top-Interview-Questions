/*****
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*****/

class Solution {
    public int singleNumber(int[] nums) {
        
        //using HashMap
//         Map<Integer,Integer> map = new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(nums[i])){
//                 map.put(nums[i], map.get(nums[i])+1);
//             } else {
//                 map.put(nums[i],1);
//             }
            
//         }
//         for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//             if (entry.getValue() == 1)
//                 return entry.getKey();
//         }
//         return 0;
        
        //Using XOR
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;

    }
}
