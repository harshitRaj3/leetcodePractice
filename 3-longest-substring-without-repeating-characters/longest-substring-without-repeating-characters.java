class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
        int maxlen=0;
        HashMap<Character,Integer>map=new HashMap<>();
        while(r<s.length()){
           if(!map.containsKey(s.charAt(r))){
            map.put(s.charAt(r),1);
             maxlen=Math.max(maxlen,r-l+1);
            r++;
           }
           else{
            map.remove(s.charAt(l));
           
            l++;
           }
        }
        
        return maxlen;
    }
}