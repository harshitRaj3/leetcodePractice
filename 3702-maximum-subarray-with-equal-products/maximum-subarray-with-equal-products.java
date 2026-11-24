class Solution {
    public int maxLength(int[] nums) {
        int n =nums.length;
        int maxlen=0;
        for(int i=0; i<n; i++){
            long prod=1;
            long gp=0;
            long lcm=1;
            for(int j=i;j<n;j++){
                int x=nums[j];
                prod*=x;
                gp=gcd((int)gp,x);
                lcm=(lcm/gcd((int)lcm,x))*x;

                if(prod==gp*lcm){
                    maxlen=Math.max(maxlen,j-i+1);
                }
                if(prod>gp*lcm) break;

            }
        }
         return maxlen;
        
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