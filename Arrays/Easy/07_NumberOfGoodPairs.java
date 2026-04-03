// Given an array of integers nums, return the number of good pairs.

// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                count+=map.get(nums[i]);
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}
