class Solution {
    public int countHillValley(int[] nums) {
        int count=0;
        int left=nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==left){
                continue;
            }
            int right=i+1;
            while(right<nums.length && nums[right]==nums[i]){
                right++;
            }
            if(right==nums.length) break;
            if(nums[i]>left && nums[i]> nums[right]){
                count++;
            }
            if(nums[i]<left && nums[i]<nums[right]){
                count++;
             
            }
               left=nums[i];
        }
        return count;
   
    }
}