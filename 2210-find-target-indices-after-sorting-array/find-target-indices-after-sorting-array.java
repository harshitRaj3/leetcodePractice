import java.util.*;
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
       ArrayList<Integer>index=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index.add(i);
            }
        }
        return index;
    }
}