class Solution {
    public int minimumRecolors(String blocks, int k) {
        int r=0;
        int l=0;
     int op=0;
     int ans=Integer.MAX_VALUE;
     while(r<blocks.length()){
        if(blocks.charAt(r)=='W') op++;
        if(r-l+1==k){
            ans=Math.min(ans,op);
            if(blocks.charAt(l)=='W'){
                op--;
            
            }
                l++;
        }
        r++;
     }
     return ans;
    }
}