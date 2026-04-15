class Solution {
    public boolean isPowerOfTwo(int n) {
        long product=1;
        while(product<n){
            product=product*2;
        
        }
      if(product==n) return true;
        else return false;
        
    }
}