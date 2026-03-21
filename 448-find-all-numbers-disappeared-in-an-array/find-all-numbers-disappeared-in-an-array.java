class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {    
        HashSet<Integer> set=new HashSet<>();
        int n=nums.length;
        for(int i=1;i<=n;i++){
            set.add(i);
        }
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])) set.remove(nums[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:set){
            list.add(x);
        }
        return list;
    }
}