// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                runningSum[i]=nums[i];
            }else{
                runningSum[i]=Integer.sum(nums[i],runningSum[i-1]);
            }
        }
        return runningSum;
    }
}
