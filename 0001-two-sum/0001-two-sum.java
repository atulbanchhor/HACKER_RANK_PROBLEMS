class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i< nums.length;i++){
            for(int j = i+1;j< nums.length;j++){            // maine 2 loop chalaya jo 0 position ko pakad k aaage badthe rahega to check karte rahega apne ek aage s 
                if(nums[i]+nums[j]==target){                // aur jahan bhi dono ka sum target k equal aaya wahin s uski index return kr dega 
                    return new int[]{i,j};
                    
                }
            }
        }
        
        return nums;
    }
}
