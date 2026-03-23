class Solution {
    public boolean isPalindrome(int x) {
        int d = x;
        int rev=0;
        while(x>0){
            int lastdigit = x%10;
            rev= rev*10+lastdigit;
            x=x/10;


        }
        if(rev==d){
            return true;
        }
        else 
        return false;
        
    }
}