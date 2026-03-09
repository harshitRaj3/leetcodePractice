class Solution {
    public boolean validMountainArray(int[] nums) {
        if(nums.length<3) return false; 
        int peak=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[peak]){
                peak=i;
            }
            if(peak==0||peak==nums.length-1) return false;
        }
        for(int i=0;i<peak;i++){
            if(nums[i]>=nums[i+1]) return false;
        }
        for(int i=peak;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]) return false;
        }
    
            
         
         return true;
         
    }
}