// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest 
// number of candies among all the kids, or false otherwise.

import java.util.ArrayList;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies=0;
        for(int candy:candies){
            maxcandies=Math.max(maxcandies,candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy:candies){
            if(candy+extraCandies>=maxcandies){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
