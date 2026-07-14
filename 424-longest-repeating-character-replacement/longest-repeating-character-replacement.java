class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxf=0;
        int maxlen=0;
        HashMap<Character,Integer> freq=new HashMap<>();
        while(r<s.length()){
            freq.put(s.charAt(r),freq.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,freq.get(s.charAt(r)));
          
        
            
            if((r-l+1)-maxf>k){
               freq.put(s.charAt(l),freq.get(s.charAt(l))-1);
                l++;
            }
             maxlen=Math.max(r-l+1,maxlen);
                r++;
        }
        return maxlen;
    }
}