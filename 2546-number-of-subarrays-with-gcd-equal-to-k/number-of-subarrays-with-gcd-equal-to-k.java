class Solution {
    public int subarrayGCD(int[] nums, int k) {
  
        int n =nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            long prod=1;
            long gp=0;
          
            for(int j=i;j<n;j++){
                int x=nums[j];
                gp=gcd((int)gp,x);
               

               if(gp==k) count++;

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
