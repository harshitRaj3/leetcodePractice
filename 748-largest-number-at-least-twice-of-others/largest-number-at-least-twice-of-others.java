class Solution {
    public int dominantIndex(int[] nums) {
         int max=-1;
         int Smax=-1;
         int index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                Smax=max;
                max=nums[i];
                index=i;
            }
            else if(nums[i]>Smax){
                Smax=nums[i];
            }
    }
    if(max>=2*Smax) return index;
    return -1;
}
}

