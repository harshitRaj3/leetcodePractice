class Solution {
    public int matrixScore(int[][] nums) {
        int m=nums.length;
        int n=nums[0].length;
        for(int i=0;i<m;i++){
            if(nums[i][0]==0){
                for(int j=0;j<n;j++){
                    nums[i][j]^=1;
                }
            }
        }
        for(int j=0;j<n;j++){
            int zeros=0;
            int ones=0;
            for(int i=0;i<m;i++){
                if(nums[i][j]==0) zeros++;
                 else ones++;
            }
      if(zeros>ones){
        for(int i=0;i<m;i++){
            nums[i][j]^=1;
        }
      }
        }
        int sum=0;
        int pow=1;
        for(int j=n-1;j>=0;j--){
            int ones=0;
            for(int i=0;i<m;i++){
                if(nums[i][j]==1) ones++;
            }
            sum+=pow*ones;
            pow*=2;
        }
        return sum;
    }
}