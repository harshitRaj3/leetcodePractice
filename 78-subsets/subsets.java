class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int subsets=1<<n;
        ArrayList<List<Integer>>ans= new ArrayList<>();
        for(int i=0;i<=subsets-1;i++){
            ArrayList<Integer>set=new ArrayList<>();
            for(int j=0;j<=n-1;j++){
                if((i&(1<<j))!=0){
                    set.add(nums[j]);
                }
            }
            ans.add(set);
        }
        return ans;
    }
}