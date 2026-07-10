class Solution {
    public int maxVowels(String s, int k) {
        
        int l=0;
        int r=0;
        int count=0;
        int max=0;
        while(r<s.length()){
           if(s.charAt(r)=='a'||s.charAt(r)=='e'||s.charAt(r)=='i' ||s.charAt(r)=='o' ||s.charAt(r)=='u' ) count++;
           if(r-l+1<k) {
            r++;
           }
           else if(r-l+1==k){
            max=Math.max(count,max);
            if(s.charAt(l)=='a'||s.charAt(l)=='e' ||s.charAt(l)=='i' ||s.charAt(l)=='o' ||s.charAt(l)=='u' ){
                count--;
               
            }
             l++;
            r++;
           }


        }
        return max;
    }
}