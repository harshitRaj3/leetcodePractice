class Solution {

    private int sumby(int[]arr,int div){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Math.ceil((double)arr[i]/div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
             if(sumby(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
             }
             else low=mid+1;
        }
        return ans;
    }
}