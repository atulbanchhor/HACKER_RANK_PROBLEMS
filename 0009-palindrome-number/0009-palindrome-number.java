class Solution {
    public boolean isPalindrome(int x) {
        int temp , reverse=0, rem;
        temp = x ;
        
        if(x>=0){
          while (temp != 0){
            rem = temp % 10;               //  yahan s mai last ko nikal k rem m dal ra hu  
            reverse = reverse * 10 + rem;  //  rem ko last m add kr ra reverse m
            temp = temp /10;
        }
            
            if(reverse == x){
                return true;
            }
            
            return false;
        } 
        return false;
    }
}