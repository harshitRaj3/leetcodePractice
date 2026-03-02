class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            int f=mid,se=mid;
            if(nums[mid-1]==nums[mid]){
                f=mid-1;
            }
            else if(nums[mid]==nums[mid+1]){
                se=mid+1;
            }
            int leftcount=f-low;
            int rightcount=high-se;
            if(leftcount%2==0){
                low=se+1;
            }
            else high=se-1;
        }
      return 1;  
    }
}