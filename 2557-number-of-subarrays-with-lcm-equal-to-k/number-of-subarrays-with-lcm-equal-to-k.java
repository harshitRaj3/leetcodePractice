class Solution {
    public int subarrayLCM(int[] nums, int k) {
          int n =nums.length;
       int count=0;
        for(int i=0; i<n; i++){
           
            long gp=0;
            long lcm=1;
            for(int j=i;j<n;j++){
                int x=nums[j];
                
                lcm=(lcm/gcd((int)lcm,x))*x;

                if(lcm==k) count++;
                
                if(lcm>k) break;

            }
        }
         return count;
        
    }
     public int gcd(int a,int b){
        while(b!=0){
            int rem=a % b;
            a=b;
            b=rem;
        }
        return a;
        
    }
}