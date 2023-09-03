class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;                               //yahan par mai ek element ko pakad k uske aage
        for(int j =0;j<nums.length;j++){        // wale s compare karunga aur vo dono equal h
            if(nums[i]!=nums[j]){               // to leave kr dunga aur agar nai hai to jis 
                i++;                            // index ko hold kia tha usko ++ kar k jis s 
                nums[i]=nums[j];                // compare kr ra tha usko usme daal dunga
            }
        }
        return i+1;                             // because mai ek aage s chalu kr ra hu 
    }
}