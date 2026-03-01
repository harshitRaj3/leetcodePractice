class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++){
            int target=n.charAt(i)-'0';
            if(target>max){
                max=target;
            }
       }
       return max;
                                                                                                           }  


        
    }
